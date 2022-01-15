package com.example.apkt4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apkt4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodModel:foodModel

        var list : ArrayList<foodModel> =  ArrayList<foodModel>()

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
            }

        } )


        binding.rvItem.layoutManager = LinearLayoutManager(this)


    }
}