package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnPindah:Button = findViewById(R.id.btnPindah)
        val btnShare: MaterialButton = findViewById(R.id.btnShare)

        btnPindah.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            startActivity(intent)
        }
        btnShare.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Saya Order Matcha Latte!")
            intent.setType("Text/Plain")
            startActivity(Intent.createChooser(intent,"Share To: "))
        }
    }
}
