package it.gcriscione.supportedscansettingslibrary

import android.bluetooth.BluetoothAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import it.gcriscione.supportedscansettings.SupportedScanSettings

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val supportedScanSettings = SupportedScanSettings().getBuilder(
                BluetoothAdapter.getDefaultAdapter()
        )

    }
}
