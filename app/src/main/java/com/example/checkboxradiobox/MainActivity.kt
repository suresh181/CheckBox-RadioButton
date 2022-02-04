package com.example.checkboxradiobox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.checkboxradiobox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.tvQues.text = "Kotlin was developed by"
        binding.rbA.setText("Google")
        binding.rbB.setText("MicroSoft")
        binding.rbC.setText("JetBrain")
        binding.rbD.setText("Adobe")

        binding.grList.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{ group, checkedId ->
            val radioButton: RadioButton = findViewById(checkedId)
            if (binding.rbA.isChecked){
                Toast.makeText(this,"InCorrect Answer", Toast.LENGTH_SHORT).show()
            }else if (binding.rbB.isChecked){
                Toast.makeText(this,"InCorrect Answer", Toast.LENGTH_SHORT).show()
            }else if (binding.rbC.isChecked){
                Toast.makeText(this,"Correct Answer", Toast.LENGTH_SHORT).show()
            }else if (binding.rbD.isChecked){
                Toast.makeText(this,"InCorrect Answer", Toast.LENGTH_SHORT).show()

            }

        })

    }
}