package com.lagradost.cloudstream3.updates

object UpdateConfig {
    /**
     * Default remote JSON update endpoint URL
     */
    const val DEFAULT_UPDATE_URL = "https://pub-e9a64ec2e4424ee6b04d9dac6a883b3b.r2.dev/update.json"

    /**
     * Network timeouts & retries
     */
    const val CONNECT_TIMEOUT_MS = 15000L
    const val READ_TIMEOUT_MS = 15000L
    const val MAX_RETRY_COUNT = 3

    /**
     * Minimum interval between automatic update checks, in milliseconds.
     * 0 = check on every app open (Home screen load).
     */
    const val CHECK_INTERVAL_MS = 0L

    /**
     * Preference Defaults
     */
    const val AUTO_CHECK_DEFAULT = true
    const val WIFI_ONLY_DEFAULT = false
    const val NOTIFY_BETA_DEFAULT = false

    /**
     * Logging Tag for Analytics & Diagnostics
     */
    const val LOG_TAG = "OpenstreamUpdate"
}
