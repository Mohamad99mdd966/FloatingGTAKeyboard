package com.gta.cheat

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MainService : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("MainService", "Service Started")
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainService", "Service Destroyed")
    }
}
