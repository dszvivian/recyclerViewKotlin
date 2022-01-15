package com.example.apkt4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.lang.reflect.Array.get

class MyAdapter (private val foodlist : ArrayList<foodModel>):
    RecyclerView.Adapter<MyAdapter.myViewHolder>() {

    private lateinit var mListner : onItemClicklistner

    interface onItemClicklistner{
        fun onItemClick(position: Int)
    }

    fun setOnItemclickListner(listner:onItemClicklistner){
        mListner = listner
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.sample_rvlayout,parent,false)
        return myViewHolder(itemView,mListner)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {

        val currentItem = foodlist[position]
        holder.pic.setImageResource(currentItem.picture)
        holder.title.text = currentItem.name
        holder.description.text = currentItem.desc

    }

    override fun getItemCount(): Int {
        return foodlist.size
    }


    class myViewHolder(val itemView : View , listner: onItemClicklistner): RecyclerView.ViewHolder(itemView) {
        val pic = itemView.findViewById<ImageView>(R.id.ivFoodimage)
        val title = itemView.findViewById<TextView>(R.id.tvTitle)
        val description = itemView.findViewById<TextView>(R.id.tvDescription)

        init {
            itemView.setOnClickListener {
                listner.onItemClick(adapterPosition)
            }
        }

    }

}