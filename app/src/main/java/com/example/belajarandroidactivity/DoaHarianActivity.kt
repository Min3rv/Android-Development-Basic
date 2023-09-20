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
import com.example.belajarandroidactivity.adapter.DoaHarianAdapter
import com.example.belajarandroidactivity.model.Doa
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val rvDoaHarian: RecyclerView = findViewById(R.id.rvDoaHarian)
        val data = arrayListOf<DoaHarian>(
            DoaHarian("Doa Bangun Tidur", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ",
                "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            DoaHarian("Doa Sebelum Tidur", "بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ",
                "Bismikallohumma ahya wa amuutu"),
            DoaHarian("Doa Sebelum Makan", "اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّا",
                "Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar"),
            DoaHarian("Doa Sesudah Makan", "اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ",
                "Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin"),
            DoaHarian("Doa Masuk Kamar Mandi Atau Toilet", "اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ",
                "Alloohumma Innii a'uudzubika minal khubutsi wal khoaaitsi")
        )
        val adapter = DoaHarianAdapter(data)
        rvDoaHarian.adapter = adapter
        rvDoaHarian.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
    }
    }
