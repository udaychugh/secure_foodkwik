package com.udaychugh.foodkwik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView

class signup_activity : AppCompatActivity() {

    lateinit var gotohome : RelativeLayout
    lateinit var gotosign : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_activity)

        gotohome=findViewById(R.id.signupsuccess)
        gotosign=findViewById(R.id.gotosign)

        gotohome.setOnClickListener {
            val intent = Intent(this@signup_activity, add_address::class.java)
            startActivity(intent)
            finish()
        }

        gotosign.setOnClickListener {
            val intent = Intent(this@signup_activity, signup_activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}