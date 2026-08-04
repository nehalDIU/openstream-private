package com.lagradost.cloudstream3

object AppConfig {
    const val APP_NAME = "Openstream"
    const val DEFAULT_REPOSITORY_URL = "https://raw.githubusercontent.com/sheikhshariarnehal/nehal-CloudStream/master/repo.json"
    const val DEFAULT_REPOSITORY_NAME = "Openstream Repository"

    val VERSION: String get() = BuildConfig.VERSION_NAME

    // Default Settings & Retry Configurations
    const val MAX_RETRIES = 3
    const val RETRY_DELAY_MS = 2000L
    const val LOG_TAG = "Openstream"
}
