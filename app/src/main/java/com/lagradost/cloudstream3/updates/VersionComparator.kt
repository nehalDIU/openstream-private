package com.lagradost.cloudstream3.updates

object VersionComparator {

    /**
     * Determines whether an update is available based on remote and installed versions.
     * Primary comparison uses integer versionCodes. If equal, falls back to semantic version string parsing.
     */
    fun isUpdateAvailable(
        installedVersionCode: Int,
        remoteVersionCode: Int,
        installedVersionName: String,
        remoteVersionName: String
    ): Boolean {
        if (remoteVersionCode > installedVersionCode) {
            return true
        }

        if (remoteVersionCode == installedVersionCode) {
            return compareSemVer(remoteVersionName, installedVersionName) > 0
        }

        return false
    }

    /**
     * Compares two semantic version strings (e.g. "2.5.0" vs "2.4.1")
     * Returns positive if v1 > v2, negative if v1 < v2, zero if equal.
     */
    fun compareSemVer(v1: String, v2: String): Int {
        val parts1 = extractNumbers(v1)
        val parts2 = extractNumbers(v2)

        val maxLen = maxOf(parts1.size, parts2.size)
        for (i in 0 until maxLen) {
            val num1 = parts1.getOrElse(i) { 0 }
            val num2 = parts2.getOrElse(i) { 0 }
            if (num1 != num2) {
                return num1.compareTo(num2)
            }
        }

        return 0
    }

    private fun extractNumbers(versionStr: String): List<Int> {
        return versionStr.replace(Regex("[^0-9.]"), "")
            .split(".")
            .mapNotNull { it.toIntOrNull() }
    }
}
