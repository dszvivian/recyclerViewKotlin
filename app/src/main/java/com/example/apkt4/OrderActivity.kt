package com.example.apkt4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.apkt4.databinding.ActivityOrderBinding

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val Bundle:Bundle? = intent.extras
        val name = Bundle!!.getString("name")
        val picture = Bundle.getInt("picture")

        binding.odIvPicture.setImageResource(picture)
        binding.odTvName.text = name
        binding.button.setOnClickListener{
            if (name == "Pizza"){
                Toast.makeText(this@OrderActivity , "$name will be delivered at your doorstep in next 30 minutes",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this@OrderActivity , "$name Ordered",Toast.LENGTH_SHORT).show()
            }
        }
    }
}