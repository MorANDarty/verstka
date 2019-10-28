package com.shgbievi.hometask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class Adapter constructor(val data: List<Int>) : RecyclerView.Adapter<Adapter.TicketsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TicketsViewHolder {
        return TicketsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_ticket, parent, false))
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: TicketsViewHolder, position: Int) {

    }


    inner class TicketsViewHolder(view:View):RecyclerView.ViewHolder(view)
}