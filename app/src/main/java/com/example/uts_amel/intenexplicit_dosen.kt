package com.example.uts_amel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class intenexplicit_dosen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intenexplicit_dosen)
        val t_nip: TextView = findViewById(R.id.nipdos)
        val t_nama: TextView = findViewById(R.id.namados)
        val t_email: TextView = findViewById(R.id.emaildos)
        val t_alamat: TextView = findViewById(R.id.alamatdos)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)

        val bundle = intent.extras
        t_nip.setText(bundle?.getString("nip"))
        t_nama.setText(bundle?.getString("nama"))
        t_email.setText(bundle?.getString("email"))
        t_alamat.setText(bundle?.getString("alamat"))

        btn1.setOnClickListener {
            val intent = Intent(this,inputdosen::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this,beranda::class.java)
            startActivity(intent)
        }
    }
}