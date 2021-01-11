package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpButtons()
    }

    private fun setUpButtons() {
        findViewById<Button>(R.id.incButton).setOnClickListener {
            incrementValue()
        }
        findViewById<Button>(R.id.decButton).setOnClickListener {
            decrementValue()
        }
    }

    private fun incrementValue() {
        findViewById<TextView>(R.id.changeableValue).apply {
            text = (text.toString().toInt() + 1).toString()
        }
    }

    private fun decrementValue() {
        findViewById<TextView>(R.id.changeableValue).apply {
            text = (text.toString().toInt() - 1).toString()
        }
    }
}