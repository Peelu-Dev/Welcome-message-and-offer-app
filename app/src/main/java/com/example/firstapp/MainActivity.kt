package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.tv)
        val inputMessage = findViewById<EditText>(R.id.enter_your_name)
        val btn = findViewById<Button>(R.id.btnSubmit)
        val offersButton = findViewById<Button>(R.id.btnOffers)
        var enteredName = ""

        btn.setOnClickListener {
            enteredName = inputMessage.text.toString()
            if(enteredName == ""){
                offersButton.visibility = INVISIBLE
                greetingTextView.text = ""
                Toast.makeText(this@MainActivity,"please, enter your name",Toast.LENGTH_SHORT).show()
            }else {
                val message = "Welcome $enteredName"
                greetingTextView.text = message
                inputMessage.text.clear()
                offersButton.visibility = VISIBLE
            }
        }
        offersButton.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("USER",enteredName)
            startActivity(intent)
        }
    }
}