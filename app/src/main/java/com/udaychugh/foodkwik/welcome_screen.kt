package com.udaychugh.foodkwik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout

class welcome_screen : AppCompatActivity() {

    lateinit var makesignin : RelativeLayout
    lateinit var makesignup : RelativeLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        makesignin=findViewById(R.id.login)
        makesignup=findViewById(R.id.signup)


        makesignin.setOnClickListener {
            val intent = Intent(this@welcome_screen, login_activity::class.java)
            startActivity(intent)
            finish()
        }

        makesignup.setOnClickListener {
            val intent = Intent(this@welcome_screen, signup_activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}