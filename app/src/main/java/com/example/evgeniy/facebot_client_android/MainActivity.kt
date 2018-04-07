package com.example.evgeniy.facebot_client_android

import android.app.Activity
import android.os.Bundle

/**
 * @author evgeniy
 * @since 07.04.18.
 */
class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigateToFragment()
    }
}