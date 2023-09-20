package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

       val tvNumber:TextView = findViewById(R.id.tvNumber)
       val buttonCount:Button = findViewById(R.id.buttonCount)
       val buttonMinus:Button = findViewById(R.id.buttonMinus)
       val buttonReset:Button = findViewById(R.id.buttonReset)

//        setText -> untuk merubah / mengisi Text
       tvNumber.text = "0"
//        getText -> mengambil Text
        println (tvNumber.text)
        Log.d("Number", "Hasilnya: ${tvNumber.text}")

//        action
        buttonCount.setOnClickListener {
            var countInteger:Int = tvNumber.text.toString().toInt()
            countInteger++

            tvNumber.text = countInteger.toString()
        }
        buttonReset.setOnClickListener {
            var countInteger:Int = tvNumber.text.toString().toInt()
            countInteger = 0

            tvNumber.text = countInteger.toString()
        }
        buttonMinus.setOnClickListener {
            var countInteger:Int = tvNumber.text.toString().toInt()
            countInteger--

            tvNumber.text = countInteger.toString()
        }

    }

}