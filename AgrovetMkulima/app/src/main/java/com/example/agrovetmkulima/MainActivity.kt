package com.example.agrovetmkulima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnGetStarted: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetStarted = findViewById(R.id.mBtnGetStarted)

        btnGetStarted.setOnClickListener{
            var anza = Intent(this, SigninActivity::class.java)
            startActivity(anza)

        }






    }
}