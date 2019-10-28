package com.shgbievi.hometask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cl_btn.setOnClickListener {
            startActivity(Intent(this, DeliveryActivity::class.java))
        }
        img_message.setOnClickListener {
            startActivity(Intent(this, SamokatusActivity::class.java))
        }
    }
}
