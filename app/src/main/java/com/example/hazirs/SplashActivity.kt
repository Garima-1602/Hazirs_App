package com.example.hazirs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class SplashActivity : AppCompatActivity() {
    lateinit var txtView: TextView;
    lateinit var clbackground: ConstraintLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_main)
        txtView=findViewById(R.id.txtView);
        clbackground=findViewById(R.id.clbackground);
        clbackground.animate().translationY(-2100F).setDuration(200).setStartDelay(1500);//move upwards


    }
}