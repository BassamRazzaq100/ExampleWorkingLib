package com.example.examplemylibrary

import android.content.Context
import android.widget.Toast

class ExampleClass {

    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }

}