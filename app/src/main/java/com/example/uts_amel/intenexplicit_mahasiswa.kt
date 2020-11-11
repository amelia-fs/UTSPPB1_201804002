package com.example.uts_amel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class intenexplicit_mahasiswa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intenexplicit_mahasiswa)
        val t_nim: TextView = findViewById(R.id.nimmhs)
        val t_nama: TextView = findViewById(R.id.namamhs)
        val t_email: TextView = findViewById(R.id.emailmhs)
        val t_alamat: TextView = findViewById(R.id.alamatmhs)
        val btn1: Button = findViewById(R.id.btn3)
        val btn2: Button = findViewById(R.id.btn4)

        val bundle = intent.extras
        t_nim.setText(bundle?.getString("nim"))
        t_nama.setText(bundle?.getString("nama"))
        t_email.setText(bundle?.getString("email"))
        t_alamat.setText(bundle?.getString("alamat"))

        btn1.setOnClickListener {
            val intent = Intent(this,inputmahasiswa::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this,beranda::class.java)
            startActivity(intent)
        }
    }
}