package com.example.activenoisecontrol.Methods

import android.Manifest
import android.app.Activity
import androidx.core.app.ActivityCompat.requestPermissions


class Permissions {

    private val REQUEST_EXTERNAL_STORAGE = 1
    private val PERMISSIONS_STORAGE = arrayOf(
        Manifest.permission.READ_EXTERNAL_STORAGE,
        Manifest.permission.WRITE_EXTERNAL_STORAGE
    )

    /**
     * Checks if the app has permission to write to device storage
     *
     * If the app does not has permission then the user will be prompted to grant permissions
     *
     * @param activity
     */
    fun verifyStoragePermissions(activity: Activity) { // Check if we have write permission
        val ALL_PERMISSIONS = 101

        val permissions = arrayOf(
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.RECORD_AUDIO
        )

        requestPermissions(activity, permissions, ALL_PERMISSIONS)
    }

}