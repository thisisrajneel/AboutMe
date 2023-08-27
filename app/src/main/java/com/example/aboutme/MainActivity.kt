package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var inputNickname : EditText
    lateinit var doneButton : Button
    lateinit var displayNickname : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputNickname = findViewById(R.id.input_nickname)
        doneButton = findViewById(R.id.btnDone)
        displayNickname = findViewById(R.id.tvNickname)

        doneButton.setOnClickListener {
            takeNickname()
        }
    }

    private fun takeNickname() {

        if (inputNickname.text.isBlank() || inputNickname.text.isEmpty()) {
            Toast.makeText(this, "What do your friends call you?", Toast.LENGTH_SHORT).show()
        }
        else {
            displayNickname.text = "Hey there, ${inputNickname.text}!"
            inputNickname.visibility = View.GONE
            doneButton.visibility = View.GONE
        }

    }
}