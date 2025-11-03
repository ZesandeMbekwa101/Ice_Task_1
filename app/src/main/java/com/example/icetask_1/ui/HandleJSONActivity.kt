package com.example.icetask_1.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.icetask_1.databinding.ActivityHandleJsonBinding

class HandleJSONActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHandleJsonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHandleJsonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Your logic for handling JSON here
    }
}
