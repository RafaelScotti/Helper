package com.zanella.helper

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

//        buttonBackToLogin.setOnClickListener{
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
//
//        }
    }

    fun toLoginScreen(view: View){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }


}