package com.example.uts_amel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class beranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)
        val btndatados: Button = findViewById(R.id.btndatadosen)
        val btndatamhs: Button = findViewById(R.id.btndatamhs)
        val inpudosen: Button = findViewById(R.id.btninputdosen)
        val inputmhs: Button = findViewById(R.id.btninputmhs)
        val btnlogout: Button = findViewById(R.id.btnlogout)

        btndatados.setOnClickListener {
            val intent = Intent(this,redosen::class.java)
            startActivity(intent)
        }
        btndatamhs.setOnClickListener {
            val intent = Intent(this,remahasiswa::class.java)
            startActivity(intent)
        }
        inpudosen.setOnClickListener {
            val intent = Intent(this,inputdosen::class.java)
            startActivity(intent)
        }
        inputmhs.setOnClickListener {
            val intent = Intent(this,inputmahasiswa::class.java)
            startActivity(intent)
        }
        btnlogout.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}