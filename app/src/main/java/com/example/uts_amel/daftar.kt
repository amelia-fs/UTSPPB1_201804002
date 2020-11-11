package com.example.uts_amel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
        val btnkirim: Button = findViewById(R.id.btnkirim)
        btnkirim.setOnClickListener {
            val intent = Intent(this,klikkirim::class.java)
            startActivity(intent)
        }
    }
}