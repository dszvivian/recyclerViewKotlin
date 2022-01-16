package com.example.apkt4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apkt4.databinding.ActivityMainBinding
import java.nio.file.Files.size
import java.util.*
import kotlin.collections.ArrayList as ArrayList1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodModel:foodModel

        var list : ArrayList1<foodModel> = ArrayList1<foodModel>()

        list.add(foodModel(R.drawable.food1 , "Samosa" , "Best in the class"))
        list.add(foodModel(R.drawable.food2 , "French Fries" , "Best in the class"))
        list.add(foodModel(R.drawable.food3 , "Macroni" , "Best in the class"))
        list.add(foodModel(R.drawable.food4 , "Rice plate" , "Best in the class"))
        list.add(foodModel(R.drawable.food5 , "Fish Fry" , "Best in the class"))
        list.add(foodModel(R.drawable.food6 , "Chocolate Cake" , "Best in the class"))
        list.add(foodModel(R.drawable.food8 , "Noodles" , "Best in the class"))
        list.add(foodModel(R.drawable.food9 , "Pizza" , "Best in the class"))
        list.add(foodModel(R.drawable.food10 , "Salad" , "Best in the class"))

        val adapter = MyAdapter(list)
        binding.rvItem.adapter = adapter
        adapter.setOnItemclickListner(object : MyAdapter.onItemClicklistner {
            override fun onItemClick(position: Int) {
                val currentItem = list[position]
                Toast.makeText(this@MainActivity , "${currentItem.name} ordered",Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MainActivity,OrderActivity::class.java)
                intent.putExtra("picture",currentItem.picture)
                intent.putExtra("name",currentItem.name)
                startActivity(intent)
            }

        } )

        binding.rvItem.layoutManager = LinearLayoutManager(this)

    }
}