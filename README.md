# SupportedScanSettingsLibrary
An Android Library that implements ScanSettings support for all devices.

## Gradle Dependency
- gradle project level
 ```gradle 
allprojects {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}
```
- gradle application level
```gradle 
dependencies {
    implementation 'com.github.Datalux:SupportedScanSettingsLibrary:1.0'
 }
 ```
 
 
## Usage
### Default SupportedScanSettings

 ```kotlin
 val supportedScanSettings = SupportedScanSettings().getBuilder(BluetoothAdapter.getDefaultAdapter()) 
```

### Custom SupportedScanSettings
You can set `ScanMode`, `MatchMode`, `NumOfMatch` or `CallbackType` programmatically using `getBuilder` params.
 ```kotlin
val supportedScanSettings = SupportedScanSettings().getBuilder(
        BluetoothAdapter.getDefaultAdapter(),
        scanMode = ScanSettings.SCAN_MODE_BALANCED,
        matchMode = ScanSettings.MATCH_MODE_STICKY,
        numOfMatch = ScanSettings.MATCH_NUM_FEW_ADVERTISEMENT,
        callbackType = ScanSettings.CALLBACK_TYPE_FIRST_MATCH
)
```


#### Params
See https://developer.android.com/reference/kotlin/android/bluetooth/le/ScanSettings
