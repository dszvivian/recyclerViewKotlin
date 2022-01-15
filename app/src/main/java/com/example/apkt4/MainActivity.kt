package com.example.apkt4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
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
        list.add(foodModel(R.drawable.food2 , "Samosa" , "Best in the class"))
        list.add(foodModel(R.drawable.food3 , "Samosa" , "Best in the class"))
        list.add(foodModel(R.drawable.food4 , "Samosa" , "Best in the class"))
        list.add(foodModel(R.drawable.food5 , "Samosa" , "Best in the class"))
        list.add(foodModel(R.drawable.food6 , "Samosa" , "Best in the class"))
        list.add(foodModel(R.drawable.food8 , "Samosa" , "Best in the class"))
        list.add(foodModel(R.drawable.food9 , "Samosa" , "Best in the class"))
        list.add(foodModel(R.drawable.food10 , "Samosa" , "Best in the class"))

        val adapter = MyAdapter(list)
        binding.rvItem.adapter = adapter


        binding.rvItem.layoutManager = LinearLayoutManager(this)


    }
}