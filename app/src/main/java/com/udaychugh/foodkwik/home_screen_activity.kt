package com.udaychugh.foodkwik

import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class home_screen_activity : AppCompatActivity() {

    lateinit var thesearch : RelativeLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen_activity)

        thesearch=findViewById(R.id.thesearch)

        val recyclerView = findViewById<RecyclerView>(R.id.searchitemsview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<searchitemviewmodel>()

        data.add(searchitemviewmodel("Pizza"))
        data.add(searchitemviewmodel("Dim sum"))
        data.add(searchitemviewmodel("Burger"))
        data.add(searchitemviewmodel("Paneer"))
        data.add(searchitemviewmodel("Soup"))
        data.add(searchitemviewmodel("Rice"))
        data.add(searchitemviewmodel("Bread"))
        data.add(searchitemviewmodel("Sweet"))
        data.add(searchitemviewmodel("French Fries"))
        data.add(searchitemviewmodel("Ice Cream"))
        data.add(searchitemviewmodel("Pancakes"))
        data.add(searchitemviewmodel("Pasta"))

        val adapter = customAdapter(data)
        recyclerView.adapter = adapter

    }
}