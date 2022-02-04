package com.example.checkboxradiobox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.checkboxradiobox.databinding.ActivityCheckBoxBinding

class CheckBox : AppCompatActivity() {
    private lateinit var binding: ActivityCheckBoxBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        binding = ActivityCheckBoxBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var amount = 0
        binding.cbPizza.setOnClickListener {
            if (binding.cbPizza.isChecked)
                amount += 10
            else
                amount -= 10
            binding.tvAmount.text = "Total Amount to be pay is: $amount$"
            Toast.makeText(this,"You have Selected Pizza", Toast.LENGTH_SHORT).show()
        }

        binding.cbBurger.setOnClickListener {
            if (binding.cbBurger.isChecked)
                amount += 15
            else
                amount-=15
            binding.tvAmount.text = "Total Amount to be pay is: $amount.$"
            Toast.makeText(this,"You have Selected Burger", Toast.LENGTH_SHORT).show()
        }
        binding.cbDonut.setOnClickListener {
            if (binding.cbDonut.isChecked)
                amount += 20
            else
                amount-=20
            binding.tvAmount.text = "Total Amount to be pay is: $amount.$"
            Toast.makeText(this,"You have Selected Donut", Toast.LENGTH_SHORT).show()
        }
        binding.cbFrenchfries.setOnClickListener {
            if (binding.cbFrenchfries.isChecked)
                amount += 5
            else
                amount-= 5
            binding.tvAmount.text = "Total Amount to be pay is: $amount.$"
            Toast.makeText(this,"You have Selected FrenchFries", Toast.LENGTH_SHORT).show()

        }
    }
}