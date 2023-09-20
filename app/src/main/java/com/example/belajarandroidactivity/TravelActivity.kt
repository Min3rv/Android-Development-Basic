package com.example.belajarandroidactivity

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {
    var ibCall: ImageButton? = null
    var ibNavi: ImageButton? = null
    var ibShare: ImageButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)

        ibCall = findViewById(R.id.ibCall)
        ibNavi = findViewById(R.id.ibNavi)
        ibShare = findViewById(R.id.ibShare)

        ibCall!!.setOnClickListener {
            val phoneNumber = "02512312323"
            val phoneIntent = Intent(Intent.ACTION_DIAL,
                Uri.parse("tel: $phoneNumber"))
            startActivity(phoneIntent)
        }
        ibNavi!!.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW,
            Uri.parse("geo:46.4918920165788, 7.686697344618071")
            )
        mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        ibShare!!.setOnClickListener {

        }

    }
}