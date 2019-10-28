package com.shgbievi.hometask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_samokatus.*

class DeliveryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery1)
        supportActionBar?.title = "Оплата и доставка"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
