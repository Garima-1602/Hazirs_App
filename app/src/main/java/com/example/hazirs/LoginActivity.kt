package com.example.hazirs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
     lateinit var txthazir:TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        txthazir=findViewById(R.id.txthazir)
        setContentView(R.layout.activity_login)
    }
}