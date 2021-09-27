package com.udaychugh.foodkwik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView

class login_activity : AppCompatActivity() {

    lateinit var getemail : EditText
    lateinit var getpass : EditText
    lateinit var btnsignin : RelativeLayout
    lateinit var gotosignup : TextView
    lateinit var gotoforgotpass : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_activity)

        getemail=findViewById(R.id.loginemail)
        getpass=findViewById(R.id.loginpass)
        btnsignin=findViewById(R.id.loginsuccess)
        gotosignup=findViewById(R.id.gotosignup)
        gotoforgotpass=findViewById(R.id.gotoforgotpass)

        btnsignin.setOnClickListener {
            val intent = Intent(this@login_activity, home_screen_activity::class.java)
            startActivity(intent)
            finish()
        }

        gotosignup.setOnClickListener {
            val intent = Intent(this@login_activity, signup_activity::class.java)
            startActivity(intent)
            finish()
        }

        gotoforgotpass.setOnClickListener {
            val intent = Intent(this@login_activity, forgot_password::class.java)
            startActivity(intent)
            finish()
        }

    }
}