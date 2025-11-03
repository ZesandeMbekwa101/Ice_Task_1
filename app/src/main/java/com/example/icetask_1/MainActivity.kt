package com.example.icetask_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.icetask_1.databinding.ActivityMain2Binding
import com.example.icetask_1.ui.Fragment.PostFragment3

class MainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        // Load the PostFragment into the container
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, PostFragment3())
            .commit()
    }
}