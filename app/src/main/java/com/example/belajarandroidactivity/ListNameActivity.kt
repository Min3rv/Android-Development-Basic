package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_name)

        // use ArrayAdapter and Define an Array
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Ross","Duke","Taylor","Kane","Vermi"
        )
        //  access the ListView from xmi file
        var mListView = findViewById<ListView>(R.id.lvName)
        // call object ArrayAdapter (this, layout_sample, data)
        arrayAdapter = ArrayAdapter(this,
        android.R.layout.simple_list_item_1, users)
        // isi adapter
        mListView.adapter = arrayAdapter
    }
}