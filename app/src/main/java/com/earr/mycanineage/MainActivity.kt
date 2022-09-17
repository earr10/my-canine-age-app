package com.earr.mycanineage

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.earr.mycanineage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val resultText = binding.resultText

        binding.calculateButton.setOnClickListener {
            val ageString = binding.ageEdit.text.toString()
            if (ageString.isNotEmpty()) {
                val ageInt = ageString.toInt()
                val result = ageInt * 7
                resultText.text = getString(R.string.result_text, result)
            } else {
                Toast.makeText(this, R.string.insert_your_age, Toast.LENGTH_SHORT).show()
            }
        }
    }
}