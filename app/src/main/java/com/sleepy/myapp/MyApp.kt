package com.sleepy.myapp

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build


public class MyApp : Application() {
/*    object CHANNEL_ID {
        fun getValue(): String{
            return "autoStartServiceChannel"
        }
    }

    object CHANNEL_NAME {
        fun getValue(): String{
            return "Auto Start Service Channel"
        }
    }
*/
    override fun onCreate() {
        super.onCreate()
        /*createNotificationChannel()
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val serviceChannel = NotificationChannel(
                CHANNEL_ID.getValue(),
                CHANNEL_NAME.getValue(),
                NotificationManager.IMPORTANCE_DEFAULT
            )
            val manager = getSystemService(
                NotificationManager::class.java
            )
            manager.createNotificationChannel(serviceChannel)
        }*/
    }
    
}