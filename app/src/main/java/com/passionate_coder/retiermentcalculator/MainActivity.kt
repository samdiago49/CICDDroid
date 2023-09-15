package com.passionate_coder.retiermentcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(application,"2c22d333-a6d4-4ad3-ad53-1ed5d759fcf2",
            Analytics::class.java,Crashes::class.java)
    }
}