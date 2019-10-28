package com.shgbievi.hometask

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_samokatus.*

class SamokatusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_samokatus)
        val adapter = Adapter(arrayListOf(1,2,3,4,5))
        rv_tickets.layoutManager = LinearLayoutManager(this)
        rv_tickets.adapter = adapter
    }
}
