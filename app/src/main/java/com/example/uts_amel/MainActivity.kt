package com.example.uts_amel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnlogin: Button = findViewById(R.id.btnlogin)
        val btndaftar: Button = findViewById(R.id.btndaftar)

        btnlogin.setOnClickListener {
            val intent = Intent(this,beranda::class.java)
            startActivity(intent)
        }
        btndaftar.setOnClickListener {
            val intent = Intent(this,daftar::class.java)
            startActivity(intent)
        }
    }
}