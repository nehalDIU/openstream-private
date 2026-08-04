package com.lagradost.cloudstream3.updates

import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import android.os.Environment
import android.util.Log
import java.io.File

class UpdateDownloader(private val context: Context) {

    private val downloadManager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager

    /**
     * Enqueues an APK download request with DownloadManager.
     * @return Download ID assigned by DownloadManager
     */
    fun enqueueDownload(updateResponse: UpdateResponse, wifiOnly: Boolean): Long {
        val destinationFile = getUpdateApkFile(context, updateResponse.versionName)
        if (destinationFile.exists()) {
            destinationFile.delete()
        }

        val uri = Uri.parse(updateResponse.apkUrl)
        val request = DownloadManager.Request(uri).apply {
            setTitle("Openstream Update v${updateResponse.versionName}")
            setDescription("Downloading Openstream update...")
            setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            setDestinationUri(Uri.fromFile(destinationFile))
            setMimeType("application/vnd.android.package-archive")

            var allowedNetworks = DownloadManager.Request.NETWORK_WIFI
            if (!wifiOnly) {
                allowedNetworks = allowedNetworks or DownloadManager.Request.NETWORK_MOBILE
            }
            setAllowedNetworkTypes(allowedNetworks)
        }

        val downloadId = downloadManager.enqueue(request)
        Log.d(UpdateConfig.LOG_TAG, "Download started: ID=$downloadId, Url=${updateResponse.apkUrl}")
        return downloadId
    }

    /**
     * Queries the status of a download ID.
     */
    fun getDownloadStatus(downloadId: Long): DownloadStatus {
        val query = DownloadManager.Query().setFilterById(downloadId)
        val cursor = downloadManager.query(query)
        if (cursor != null && cursor.moveToFirst()) {
            val statusIdx = cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)
            val reasonIdx = cursor.getColumnIndex(DownloadManager.COLUMN_REASON)
            val downloadedIdx = cursor.getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR)
            val totalIdx = cursor.getColumnIndex(DownloadManager.COLUMN_TOTAL_SIZE_BYTES)

            val status = cursor.getInt(statusIdx)
            val reason = cursor.getInt(reasonIdx)
            val downloaded = cursor.getLong(downloadedIdx)
            val total = cursor.getLong(totalIdx)
            cursor.close()

            return DownloadStatus(status, reason, downloaded, total)
        }
        cursor?.close()
        return DownloadStatus(DownloadManager.STATUS_FAILED, -1, 0, 0)
    }

    data class DownloadStatus(
        val status: Int,
        val reason: Int,
        val bytesDownloaded: Long,
        val totalBytes: Long
    ) {
        val isSuccessful: Boolean get() = status == DownloadManager.STATUS_SUCCESSFUL
        val isFailed: Boolean get() = status == DownloadManager.STATUS_FAILED
        val isRunning: Boolean get() = status == DownloadManager.STATUS_RUNNING
    }

    companion object {
        fun getUpdateApkFile(context: Context, versionName: String): File {
            val updateDir = File(context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "updates")
            if (!updateDir.exists()) {
                updateDir.mkdirs()
            }
            return File(updateDir, "Openstream_v${versionName}.apk")
        }
    }
}
