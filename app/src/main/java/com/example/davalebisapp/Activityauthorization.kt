package com.example.davalebisapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class Activityauthorization : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }


    private fun init(){
        loginButton.setOnClickListener {
            signin()

        }

    }



    private fun signin(){
        val email = emailEditText.text.toString()
        val password = passwordEditText.text.toString()

        if (email.isNotEmpty() && password.isNotEmpty()){
            loginButton.isClickable = true
            val intent = Intent(this,Activityprofile::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this,"ERROR - Sheavset Yvela Veli!",Toast.LENGTH_SHORT).show()
        }
    }






}