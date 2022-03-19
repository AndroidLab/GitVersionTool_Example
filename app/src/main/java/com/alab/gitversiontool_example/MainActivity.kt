package com.alab.gitversiontool_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.textView).text = "Версия: ${BuildConfig.VERSION_NAME}"
        Log.d("myL", "1")
        Log.d("myL", "2")
        Log.d("myL", "3")
    }
}