package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val JudulForm:TextView = findViewById(R.id.JudulForm)
        val labelName:TextView = findViewById(R.id.labelName)
        val labelClass:TextView = findViewById(R.id.labelClass)
        val labelBookCode:TextView = findViewById(R.id.labelCodeBook)

        val inputName:EditText = findViewById(R.id.inputName)
        val inputClass:EditText = findViewById(R.id.inputClass)
        val inputBookCode:EditText = findViewById(R.id.inputCodeBook)
        val ButtonSubmit:Button = findViewById(R.id.ButtonSubmit)

        val showName:TextView = findViewById(R.id.showName)
        val showClass:TextView = findViewById(R.id.showClass)
        val showBookCode:TextView = findViewById(R.id.showCodeBook)

        ButtonSubmit.setOnClickListener {

            val code:Int = inputBookCode.text.toString().toInt()

            showName.text = inputName.text
            showClass.text = inputClass.text

            when (code) {
                123 ->  showBookCode.text = "Harry Potter"
                456 ->  showBookCode.text = "Alice in Wonderland"
                789 ->  showBookCode.text = "Vinland Saga"
            }
            Toast.makeText(this, "anda meminjam : ${showBookCode.text}",
                Toast.LENGTH_SHORT).show()
        }
    }
}