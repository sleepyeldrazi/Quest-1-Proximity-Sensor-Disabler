package com.sleepy.myapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.appcompat.app.AppCompatActivity
import android.content.Context
import android.app.Application
import android.util.Log


public class MainActivity : AppCompatActivity() {

/*
    override fun onCreate() {
        super.onCreate()
        //MainActivity.appContext = this

    }*/
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val serviceIntent = Intent(this, AutoStartService::class.java)
    //serviceIntent.putExtra("inputExtra", "passing any text")
    ContextCompat.startForegroundService(this, serviceIntent)

}
}