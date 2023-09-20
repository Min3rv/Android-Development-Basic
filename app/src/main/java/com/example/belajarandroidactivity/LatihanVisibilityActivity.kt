package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LatihanVisibilityActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibility)
        val Text: TextView = findViewById(R.id.Text)
        val Button: Button = findViewById(R.id.Button)
        Button.setOnClickListener {
            if (Text.visibility == View.VISIBLE) {
                Text.visibility = View.INVISIBLE
            } else {
                Text.visibility = View.VISIBLE
            }
        }
    }
}