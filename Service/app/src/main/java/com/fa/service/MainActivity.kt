package com.fa.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fa.service.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            Intent(this, TimerHandlerService::class.java).also {
                it.putExtra("MSG", "Naber")
                startService(it)
            }
        }

        binding.btnStop.setOnClickListener {
            Intent(this, TimerHandlerService::class.java).also {
                it.putExtra("MSG", "İyi")
                stopService(it)
            }
        }

    }
}