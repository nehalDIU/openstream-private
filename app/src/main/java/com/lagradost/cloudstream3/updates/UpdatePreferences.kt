package com.lagradost.cloudstream3.updates

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager

class UpdatePreferences(context: Context) {
    private val prefs: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)

    var isAutoCheckEnabled: Boolean
        get() = prefs.getBoolean(KEY_AUTO_CHECK, UpdateConfig.AUTO_CHECK_DEFAULT)
        set(value) = prefs.edit().putBoolean(KEY_AUTO_CHECK, value).apply()

    var isWifiOnlyEnabled: Boolean
        get() = prefs.getBoolean(KEY_WIFI_ONLY, UpdateConfig.WIFI_ONLY_DEFAULT)
        set(value) = prefs.edit().putBoolean(KEY_WIFI_ONLY, value).apply()

    var isNotifyBetaEnabled: Boolean
        get() = prefs.getBoolean(KEY_NOTIFY_BETA, UpdateConfig.NOTIFY_BETA_DEFAULT)
        set(value) = prefs.edit().putBoolean(KEY_NOTIFY_BETA, value).apply()

    var lastCheckTimestamp: Long
        get() = prefs.getLong(KEY_LAST_CHECK_TIME, 0L)
        set(value) = prefs.edit().putLong(KEY_LAST_CHECK_TIME, value).apply()

    var lastCheckVersionCode: Int
        get() = prefs.getInt(KEY_LAST_CHECK_VERSION, 0)
        set(value) = prefs.edit().putInt(KEY_LAST_CHECK_VERSION, value).apply()

    var updateEndpointUrl: String
        get() = prefs.getString(KEY_UPDATE_ENDPOINT, UpdateConfig.DEFAULT_UPDATE_URL)
            ?.ifBlank { UpdateConfig.DEFAULT_UPDATE_URL } ?: UpdateConfig.DEFAULT_UPDATE_URL
        set(value) = prefs.edit().putString(KEY_UPDATE_ENDPOINT, value).apply()

    companion object {
        const val KEY_AUTO_CHECK = "goplay_auto_check_updates"
        const val KEY_WIFI_ONLY = "goplay_download_wifi_only"
        const val KEY_NOTIFY_BETA = "goplay_notify_beta"
        const val KEY_LAST_CHECK_TIME = "goplay_last_update_check_time"
        const val KEY_LAST_CHECK_VERSION = "goplay_last_check_version_code"
        const val KEY_UPDATE_ENDPOINT = "goplay_update_endpoint_url"
    }
}
