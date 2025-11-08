package com.wz.ledcontrol.app.ble

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Context

object WZBluetoothUtil {

    fun isEnable(context: Context): Boolean {
        return getBluetoothAdapter(context)?.isEnabled == true
    }

    fun getBluetoothAdapter(context: Context): BluetoothAdapter? {
        val bluetoothManager = context.getSystemService(Context.BLUETOOTH_SERVICE) as? BluetoothManager
        return bluetoothManager?.adapter
    }
}