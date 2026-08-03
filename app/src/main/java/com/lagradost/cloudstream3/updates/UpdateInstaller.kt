package com.lagradost.cloudstream3.updates

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import android.util.Log
import androidx.annotation.WorkerThread
import androidx.core.content.FileProvider
import java.io.File
import java.security.MessageDigest

object UpdateInstaller {

    /**
     * Verifies file existence and optional SHA256 checksum mismatch.
     */
    @WorkerThread
    fun verifyApk(apkFile: File, expectedSha256: String?): Result<Boolean> {
        if (!apkFile.exists() || apkFile.length() == 0L) {
            Log.e(UpdateConfig.LOG_TAG, "Verification failed: APK file does not exist or is 0 bytes.")
            return Result.failure(Exception("Downloaded APK file is missing or empty."))
        }

        if (!expectedSha256.isNullOrBlank()) {
            val actualHash = calculateSha256(apkFile)
            val cleanExpected = expectedSha256.trim().removePrefix("sha256-")
            val cleanActual = actualHash.removePrefix("sha256-")

            if (!cleanActual.equals(cleanExpected, ignoreCase = true)) {
                Log.e(UpdateConfig.LOG_TAG, "Checksum mismatch! Expected: $cleanExpected, Actual: $cleanActual")
                apkFile.delete()
                return Result.failure(Exception("APK SHA256 checksum mismatch. The download may be corrupted."))
            }
        }

        Log.d(UpdateConfig.LOG_TAG, "APK checksum and file integrity verified successfully.")
        return Result.success(true)
    }

    /**
     * Checks if app has permission to install packages on Android 8.0+ (API 26+)
     */
    fun canInstallPackages(context: Context): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            context.packageManager.canRequestPackageInstalls()
        } else {
            true
        }
    }

    /**
     * Opens system settings to request "Install unknown apps" permission
     */
    fun requestInstallPermission(context: Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            try {
                val intent = Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES).apply {
                    data = Uri.parse("package:${context.packageName}")
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                context.startActivity(intent)
            } catch (e: Exception) {
                Log.e(UpdateConfig.LOG_TAG, "Error opening install permission settings: ${e.message}", e)
            }
        }
    }

    /**
     * Launches Package Installer using FileProvider
     */
    fun installApk(context: Context, apkFile: File): Result<Boolean> {
        return try {
            if (!canInstallPackages(context)) {
                Log.w(UpdateConfig.LOG_TAG, "Install permission missing. Prompting user to enable in settings...")
                requestInstallPermission(context)
                return Result.failure(Exception("Package installation permission is required. Please grant permission in settings and try again."))
            }

            val authority = "${context.packageName}.provider"
            val apkUri: Uri = FileProvider.getUriForFile(context, authority, apkFile)

            val intent = Intent(Intent.ACTION_VIEW).apply {
                setDataAndType(apkUri, "application/vnd.android.package-archive")
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }

            Log.d(UpdateConfig.LOG_TAG, "Installation started: Launching Package Installer for ${apkFile.name}")
            context.startActivity(intent)
            Result.success(true)
        } catch (e: Exception) {
            Log.e(UpdateConfig.LOG_TAG, "Installation failed: ${e.message}", e)
            Result.failure(e)
        }
    }

    @WorkerThread
    private fun calculateSha256(file: File): String {
        val digest = MessageDigest.getInstance("SHA-256")
        file.inputStream().use { fis ->
            val buffer = ByteArray(8192)
            var read = fis.read(buffer)
            while (read != -1) {
                digest.update(buffer, 0, read)
                read = fis.read(buffer)
            }
        }
        return digest.digest().joinToString("") { "%02x".format(it) }
    }
}
