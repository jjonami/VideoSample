package com.jjonami.videosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setDisableCapture(true)
        setScreenOn(true)

        savedInstanceState ?: supportFragmentManager.beginTransaction()
                .replace(R.id.container, RecordingFragment.newInstance())
                .commit()
    }

    private fun setDisableCapture(isCapture: Boolean){
        if(isCapture) window.addFlags(WindowManager.LayoutParams.FLAG_SECURE)
    }

    private fun setScreenOn(isScreenOn: Boolean){
        if(isScreenOn) window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }
}
