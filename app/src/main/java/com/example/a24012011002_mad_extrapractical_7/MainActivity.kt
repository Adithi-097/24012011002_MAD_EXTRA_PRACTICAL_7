package com.example.a24012011002_mad_extrapractical_7

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<FloatingActionButton>(R.id.play_button).setOnClickListener {
            Intent(applicationContext, MusicService::class.java).
            putExtra(MusicService.SERVICE_KEY,
                MusicService.SERVICE_DATA).also { startService(it) }

        }
        findViewById<FloatingActionButton>(R.id.stop_button).setOnClickListener {
            Intent(applicationContext, MusicService::class.java).also { stopService(it) }
        }
    }
}