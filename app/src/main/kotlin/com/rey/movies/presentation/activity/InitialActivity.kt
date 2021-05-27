package com.rey.movies.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rey.movies.databinding.ActivityInitialBinding

class InitialActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInitialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInitialBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}