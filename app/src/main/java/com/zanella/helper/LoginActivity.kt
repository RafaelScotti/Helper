package com.zanella.helper

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        buttonSignUp.setOnClickListener{
//            val intentGoToSignUp = Intent(this, SignUpActivity::class.java)
//            startActivity(intentGoToSignUp)
//        }
//
//        buttonSignIn.setOnClickListener{
//            val intentGoToMain = Intent(this, BottomBarActivity::class.java)
//            startActivity(intentGoToMain)
//        }
    }


    fun toSignUpScreen(view: View){
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    fun toMainScreen(view: View){
        val intent = Intent(this, BottomBarActivity::class.java)
        startActivity(intent)
    }


}