package com.example.agrovetmkulima

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SuppliesActivity : AppCompatActivity() {
    lateinit var btnSms: Button
    lateinit var btnEmail: Button
    lateinit var btnCall: Button
    lateinit var btnexit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager)
        btnexit = findViewById(R.id.mBtnExit)
        btnSms = findViewById(R.id.MbtnSMS)
        btnEmail = findViewById(R.id.mBtnEmail)

        btnexit.setOnClickListener {
            var rudi = Intent(this, SigninActivity::class.java)
            startActivity(rudi)
        }
        btnSms.setOnClickListener {
            val uri: Uri = Uri.parse("smsto:0723670576")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "Make your request I am always available!!!!")
            startActivity(intent)
        }



        btnEmail.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "JOB APLLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear sir following the adver.....")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
    }
}