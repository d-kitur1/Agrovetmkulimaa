package com.example.agrovetmkulima

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.agrovetmkulima.databinding.ActivitySignInBinding


class SigninActivity : AppCompatActivity() {
    lateinit var edtUsername: EditText
    lateinit var edtEnterPassword: EditText
    lateinit var edtConfirmPassword: EditText
    lateinit var edtPhoneNumber: EditText
    lateinit var edtEmail: EditText
    lateinit var edtmeet:Button
    lateinit var btnback: Button
    lateinit var btnsignin: Button
   lateinit var binding: ActivitySignInBinding
   lateinit var database:Datab

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        edtUsername = findViewById(R.id.mEdtUsername)
        edtEmail = findViewById(R.id.mEdtEmail)
        edtmeet=findViewById(R.id.mBtnSignin)
        edtEnterPassword = findViewById(R.id.mEdtPassword)
        edtConfirmPassword = findViewById(R.id.mEdtConfirmPassword)
        edtPhoneNumber = findViewById(R.id.mEdtPhoneNumber)
        btnback = findViewById(R.id.Mbtnback)
        btnsignin = findViewById(R.id.mBtnSignin1)


        btnsignin.setOnClickListener{
            var username = edtUsername.text.toString()
           
        }


    }
}
