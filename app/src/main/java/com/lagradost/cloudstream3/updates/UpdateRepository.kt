package com.lagradost.cloudstream3.updates

import android.util.Log
import com.fasterxml.jackson.annotation.JsonProperty
import com.lagradost.cloudstream3.app
import com.lagradost.cloudstream3.mvvm.safeAsync
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UpdateResponse(
    @JsonProperty("versionCode") @SerialName("versionCode") val versionCode: Int = 0,
    @JsonProperty("versionName") @SerialName("versionName") val versionName: String = "",
    @JsonProperty("apkUrl") @SerialName("apkUrl") val apkUrl: String = "",
    @JsonProperty("releaseNotes") @SerialName("releaseNotes") val releaseNotes: List<String> = emptyList(),
    @JsonProperty("mandatory") @SerialName("mandatory") val mandatory: Boolean = false,
    @JsonProperty("apkSize") @SerialName("apkSize") val apkSize: Long = 0L,
    @JsonProperty("sha256") @SerialName("sha256") val sha256: String? = null
)

class UpdateRepository {

    /**
     * Fetches update information from the remote JSON endpoint with retry logic and exception handling.
     */
    suspend fun fetchUpdateInfo(url: String): Result<UpdateResponse> {
        var attempts = 0
        var lastException: Throwable? = null

        while (attempts < UpdateConfig.MAX_RETRY_COUNT) {
            attempts++
            try {
                Log.d(UpdateConfig.LOG_TAG, "Fetching update info (Attempt $attempts/${UpdateConfig.MAX_RETRY_COUNT}) from: $url")
                
                val response = safeAsync {
                    app.get(
                        url,
                        timeout = UpdateConfig.CONNECT_TIMEOUT_MS / 1000
                    ).parsedSafe<UpdateResponse>()
                }

                if (response != null && response.apkUrl.isNotBlank()) {
                    Log.d(UpdateConfig.LOG_TAG, "Successfully fetched update info: v${response.versionName} (${response.versionCode})")
                    return Result.success(response)
                } else {
                    lastException = Exception("Invalid or empty update response from server.")
                }
            } catch (e: Throwable) {
                lastException = e
                Log.e(UpdateConfig.LOG_TAG, "Error fetching update info (Attempt $attempts): ${e.message}", e)
            }
        }

        return Result.failure(lastException ?: Exception("Failed to fetch update info after retries."))
    }
}
