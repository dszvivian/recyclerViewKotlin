package com.example.apkt4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.reflect.Array.get

class MyAdapter (private val foodlist : ArrayList<foodModel>):
    RecyclerView.Adapter<MyAdapter.myViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.sample_rvlayout,parent,false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val currentItem = foodlist[position]
        holder.pic.setImageResource(currentItem.picture)
        holder.title.setText(currentItem.name)
        holder.description.setText(currentItem.desc)
    }

    override fun getItemCount(): Int {
        return foodlist.size
    }


    class myViewHolder(val itemView : View): RecyclerView.ViewHolder(itemView) {
        val pic = itemView.findViewById<ImageView>(R.id.ivFoodimage)
        val title = itemView.findViewById<TextView>(R.id.tvTitle)
        val description = itemView.findViewById<TextView>(R.id.tvDescription)

    }

}