package com.example.sdklib

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

open class SDKActivity : AppCompatActivity() {

    fun initSDK(context : Activity) {
        context.setContentView(R.layout.activity_sdk)
    }
}