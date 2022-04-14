package com.example.sdklib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

open class SDKActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}