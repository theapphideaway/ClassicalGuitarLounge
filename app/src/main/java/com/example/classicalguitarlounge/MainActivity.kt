package com.example.classicalguitarlounge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        if(supportActionBar != null) supportActionBar!!.hide()
        setContentView(R.layout.activity_main)
    }
}