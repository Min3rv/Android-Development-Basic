package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class LatihanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)

        var arrayAdapter: ArrayAdapter<*>
        var language = arrayOf(
            "Javascript","Phyton","C#","PHP","SQL Server","Ruby","Swift","Scala","GO","C++"
        )
        var mListView = findViewById<ListView>(R.id.lvProLan)
        arrayAdapter = ArrayAdapter(this,
        android.R.layout.simple_list_item_1, language)
        mListView.adapter = arrayAdapter
    }
}