package com.sleepy.myapp

import android.R
import android.app.*
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat;
import org.jetbrains.annotations.Nullable


public class AutoStartService : Service() {
    override fun onCreate() {
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        Intent().also { intent ->
            intent.setAction("com.oculus.vrpowermanager.prox_close")
            intent.putExtra("data", "Nothing to see here, move along.")
            sendBroadcast(intent)
        }/*
        val input = intent.getStringExtra("inputExtra")
        val notificationIntent = Intent(this, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(
            this,
            0, notificationIntent, 0
        )
        val notification: Notification = NotificationCompat.Builder(this, MyApp.CHANNEL_ID.getValue())
            .setContentTitle("Auto Start Service")
            .setContentText(input)
            .setContentIntent(pendingIntent)
            .build()
        val mNotificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                MyApp.CHANNEL_ID.getValue(),
                MyApp.CHANNEL_NAME.getValue(),
                NotificationManager.IMPORTANCE_DEFAULT
            )
            mNotificationManager.createNotificationChannel(channel)
            NotificationCompat.Builder(this, MyApp.CHANNEL_ID.getValue())
        }
        startForeground(1, notification)*/
        return START_NOT_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    @Nullable
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

}