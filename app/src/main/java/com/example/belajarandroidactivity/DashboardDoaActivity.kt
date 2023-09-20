package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.model.Doa

class DashboardDoaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_doa)
        val rvDoaDzikir: RecyclerView = findViewById(R.id.rvDoaDzikir)
        val data = arrayListOf<Doa>(
            Doa("Dzikir Doa & Shalat Sunnah", R.drawable.doa_harian2),
            Doa("Dzikir Harian", R.drawable.doa_harian2),
            Doa("Dzikir Doa & Shalat Sunnah", R.drawable.doa_harian2),
            Doa("Dzikir Setiap Saat", R.drawable.doa_harian2),
            Doa("Dzikir Pagi dan Petang", R.drawable.doa_harian2)
        )
        val adapter = DoaAdapter(data)
        val cvSelengkapnya: CardView = findViewById(R.id.cvSelengkapnya)

        rvDoaDzikir.adapter = adapter
        rvDoaDzikir.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        cvSelengkapnya.setOnClickListener {
            val intent = Intent(this,DoaHarianActivity::class.java)
            startActivity(intent)
        }
    }
}