package com.example.text

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.button)

        val textComponent = findViewById<TextView>(R.id.textlabel)
        var isClicked = false

        button.setOnClickListener {
            if (isClicked == false) {
                textComponent.text = "HI"
                isClicked = true
            }
            else {
                textComponent.text = "HELLO"
                isClicked = false
            }
        }
    }
}
