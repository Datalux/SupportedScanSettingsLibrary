package it.gcriscione.supportedscansettings

import android.bluetooth.BluetoothAdapter
import android.bluetooth.le.ScanSettings
import android.os.Build

class SupportedScanSettings {

    fun getBuilder(
        adapter: BluetoothAdapter,
        scanMode: Int = ScanSettings.SCAN_MODE_LOW_LATENCY,
        matchMode: Int = ScanSettings.MATCH_MODE_AGGRESSIVE,
        numOfMatch: Int = ScanSettings.MATCH_NUM_MAX_ADVERTISEMENT,
        callbackType: Int = ScanSettings.CALLBACK_TYPE_ALL_MATCHES
    ): ScanSettings.Builder {
        val scanSettingsBuilder = ScanSettings.Builder()
            .setScanMode(scanMode)
            .setMatchMode(matchMode)
            .setNumOfMatches(numOfMatch)
            .setCallbackType(callbackType)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            scanSettingsBuilder
                .setPhy(ScanSettings.PHY_LE_ALL_SUPPORTED)
                .setLegacy(true)
        }
        val f: Boolean = adapter.isOffloadedScanBatchingSupported
        if (!f) scanSettingsBuilder.setReportDelay(0) else scanSettingsBuilder.setReportDelay(1)

        return scanSettingsBuilder
    }


}