package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView = findViewById<TextView>(R.id.tvOffer)
        val userName = intent.getStringExtra("USER")
        val message = "$userName, you will get free access to all the ebooks this month so read as much as possible"
        textView.text = message
    }
}