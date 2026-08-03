package com.lagradost.cloudstream3.updates

import android.app.Activity
import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.lagradost.cloudstream3.BuildConfig
import com.lagradost.cloudstream3.CommonActivity.showToast
import com.lagradost.cloudstream3.R
import com.lagradost.cloudstream3.utils.AppContextUtils.setDefaultFocus
import com.lagradost.cloudstream3.utils.Coroutines.ioSafe
import com.lagradost.cloudstream3.utils.Coroutines.main
import java.io.File
import java.text.DecimalFormat

object UpdateManager {

    private val repository = UpdateRepository()
    private var activeDownloadId: Long? = null
    private var pendingUpdateResponse: UpdateResponse? = null
    private var downloadReceiverRegistered = false

    /**
     * Called when app Home screen completes loading.
     * Performs a non-blocking background check for updates if enabled and throttled to 24 hours.
     */
    fun checkForUpdateOnStartup(activity: Activity) {
        val hasDoneSetup = com.lagradost.cloudstream3.CloudStreamApp.getKey<Boolean>(
            com.lagradost.cloudstream3.ui.setup.HAS_DONE_SETUP_KEY, false
        ) == true
        if (!hasDoneSetup) {
            Log.d(UpdateConfig.LOG_TAG, "Auto update check skipped: Initial setup in progress.")
            return
        }

        val prefs = UpdatePreferences(activity)
        if (!prefs.isAutoCheckEnabled) {
            Log.d(UpdateConfig.LOG_TAG, "Auto update check skipped: Disabled in settings.")
            return
        }

        val currentTime = System.currentTimeMillis()
        if (currentTime - prefs.lastCheckTimestamp < UpdateConfig.CHECK_INTERVAL_MS) {
            Log.d(UpdateConfig.LOG_TAG, "Auto update check throttled (Last checked < 24h ago).")
            return
        }

        ioSafe {
            executeCheck(activity, isManual = false)
        }
    }

    /**
     * Explicit manual update check triggered from Settings screen.
     */
    fun checkForUpdateManual(activity: Activity, onFinished: (() -> Unit)? = null) {
        main {
            showToast(activity, "Checking for GoPlay updates...", Toast.LENGTH_SHORT)
        }
        ioSafe {
            executeCheck(activity, isManual = true, onFinished = onFinished)
        }
    }

    private suspend fun executeCheck(activity: Activity, isManual: Boolean, onFinished: (() -> Unit)? = null) {
        val prefs = UpdatePreferences(activity)
        val endpointUrl = prefs.updateEndpointUrl
        val installedCode = BuildConfig.VERSION_CODE
        val installedName = BuildConfig.VERSION_NAME

        val result = repository.fetchUpdateInfo(endpointUrl)
        prefs.lastCheckTimestamp = System.currentTimeMillis()

        main {
            onFinished?.invoke()
            if (result.isSuccess) {
                val updateInfo = result.getOrThrow()
                prefs.lastCheckVersionCode = updateInfo.versionCode

                val isAvailable = VersionComparator.isUpdateAvailable(
                    installedVersionCode = installedCode,
                    remoteVersionCode = updateInfo.versionCode,
                    installedVersionName = installedName,
                    remoteVersionName = updateInfo.versionName
                )

                if (isAvailable) {
                    Log.d(UpdateConfig.LOG_TAG, "Update available: v${updateInfo.versionName} (versionCode=${updateInfo.versionCode})")
                    showUpdateDialog(activity, updateInfo)
                } else {
                    Log.d(UpdateConfig.LOG_TAG, "App is up to date: Installed v$installedName ($installedCode), Remote v${updateInfo.versionName} (${updateInfo.versionCode})")
                    if (isManual) {
                        showToast(activity, "GoPlay is up to date! (v$installedName)", Toast.LENGTH_LONG)
                    }
                }
            } else {
                val errorMsg = result.exceptionOrNull()?.message ?: "Network error"
                Log.e(UpdateConfig.LOG_TAG, "Update check failed: $errorMsg")
                if (isManual) {
                    showToast(activity, "Could not check for updates: $errorMsg", Toast.LENGTH_LONG)
                }
            }
        }
    }

    /**
     * Displays GoPlay Material AlertDialog for new update.
     */
    fun showUpdateDialog(activity: Activity, updateResponse: UpdateResponse) {
        val builder = AlertDialog.Builder(activity)
        builder.setTitle("New Version Available")

        val sizeMb = if (updateResponse.apkSize > 0) {
            val format = DecimalFormat("#.##")
            "${format.format(updateResponse.apkSize / (1024.0 * 1024.0))} MB"
        } else {
            "Unknown size"
        }

        val notesText = if (updateResponse.releaseNotes.isNotEmpty()) {
            "\nWhat's New:\n" + updateResponse.releaseNotes.joinToString("\n") { "• $it" }
        } else ""

        val message = "Version v${updateResponse.versionName} is ready to install.\nSize: $sizeMb$notesText"
        builder.setMessage(message)

        builder.setPositiveButton("Update Now") { _, _ ->
            Log.d(UpdateConfig.LOG_TAG, "User clicked Update Now for v${updateResponse.versionName}")
            startDownloadAndUpdate(activity, updateResponse)
        }

        if (!updateResponse.mandatory) {
            builder.setNegativeButton("Later") { _, _ ->
                Log.d(UpdateConfig.LOG_TAG, "Update ignored by user: v${updateResponse.versionName}")
            }
        } else {
            builder.setCancelable(false)
        }

        val dialog = builder.create()
        dialog.setDefaultFocus()
        dialog.show()
    }

    /**
     * Enqueues download with DownloadManager and listens for completion.
     */
    private fun startDownloadAndUpdate(activity: Activity, updateResponse: UpdateResponse) {
        val prefs = UpdatePreferences(activity)
        val downloader = UpdateDownloader(activity)

        pendingUpdateResponse = updateResponse
        val downloadId = downloader.enqueueDownload(updateResponse, prefs.isWifiOnlyEnabled)
        activeDownloadId = downloadId

        showToast(activity, "GoPlay update download started...", Toast.LENGTH_SHORT)
        registerDownloadReceiver(activity.applicationContext, downloadId, updateResponse)
    }

    private fun registerDownloadReceiver(context: Context, downloadId: Long, updateResponse: UpdateResponse) {
        if (downloadReceiverRegistered) return
        downloadReceiverRegistered = true

        val filter = IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE)
        val receiver = object : BroadcastReceiver() {
            override fun onReceive(ctx: Context, intent: Intent) {
                val id = intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1L)
                if (id == downloadId) {
                    try {
                        context.unregisterReceiver(this)
                    } catch (_: Exception) {}
                    downloadReceiverRegistered = false

                    Log.d(UpdateConfig.LOG_TAG, "Download completed: ID=$downloadId")
                    handleDownloadCompleted(ctx, updateResponse)
                }
            }
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            context.registerReceiver(receiver, filter, Context.RECEIVER_EXPORTED)
        } else {
            context.registerReceiver(receiver, filter)
        }
    }

    private fun handleDownloadCompleted(context: Context, updateResponse: UpdateResponse) {
        ioSafe {
            val apkFile = UpdateDownloader.getUpdateApkFile(context, updateResponse.versionName)

            val verifyResult = UpdateInstaller.verifyApk(apkFile, updateResponse.sha256)
            if (verifyResult.isFailure) {
                val error = verifyResult.exceptionOrNull()?.message ?: "Verification failed"
                Log.e(UpdateConfig.LOG_TAG, "Installation failed: $error")
                main {
                    Toast.makeText(context, "Update verification failed: $error", Toast.LENGTH_LONG).show()
                }
                return@ioSafe
            }

            main {
                Log.d(UpdateConfig.LOG_TAG, "Installation started for v${updateResponse.versionName}")
                val installResult = UpdateInstaller.installApk(context, apkFile)
                if (installResult.isSuccess) {
                    Log.d(UpdateConfig.LOG_TAG, "Installation completed: Package installer launched.")
                } else {
                    val err = installResult.exceptionOrNull()?.message ?: "Install failed"
                    Log.e(UpdateConfig.LOG_TAG, "Installation failed: $err")
                    Toast.makeText(context, "GoPlay update installation error: $err", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
