package com.example.icetask_1.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.icetask_1.databinding.ActivityJsonDisplayBinding

class JsonDisplayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityJsonDisplayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJsonDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get JSON from Intent
        val jsonData = intent.getStringExtra("json_data")
        binding.textJson.text = jsonData
    }
}
