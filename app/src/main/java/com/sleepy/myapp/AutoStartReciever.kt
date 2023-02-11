package com.sleepy.myapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.content.ContextCompat


public class AutoStartReciever : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
            val serviceIntent = Intent(context, AutoStartService::class.java)
            //serviceIntent.putExtra("inputExtra", "passing any text")
            //Log.d("MyService", "Received Broadcast After Boot")
            ContextCompat.startForegroundService(context, serviceIntent)
    }
}