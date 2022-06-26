package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var morningBtn : Button = findViewById(R.id.morningBtn)
        var afternoonBtn :Button = findViewById(R.id.afternoonBtn)
        var eveningBtn :Button = findViewById(R.id.eveningBtn)
        var greetingText: TextView = findViewById(R.id.greetingText)
        morningBtn.setOnClickListener {
            greetingText.text = getString(R.string.good_morning_text)
        }
        afternoonBtn.setOnClickListener {
            greetingText.text = getString(R.string.good_afternoon_text)
        }
        eveningBtn.setOnClickListener {
            greetingText.text = getString(R.string.good_evening_text)
        }

    }
}