package com.udaychugh.foodkwik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout

class add_address : AppCompatActivity() {

    lateinit var addsuccess : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_address)

        addsuccess=findViewById(R.id.addsuccess)

        addsuccess.setOnClickListener {
            val intent = Intent(this@add_address, home_screen_activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}