package com.example.uts_amel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class inputmahasiswa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inputmahasiswa)
        val nim: EditText = findViewById(R.id.nim)
        val namam: EditText = findViewById(R.id.namaM)
        val emailm: EditText = findViewById(R.id.emailM)
        val alamatm: EditText = findViewById(R.id.alamatM)
        val btnsimpan: Button = findViewById(R.id.btnsimpan1)
        val btnbatal: Button = findViewById(R.id.btnbatal1)

        btnsimpan.setOnClickListener {
            val bundle= Bundle()
            bundle.putString("nim", nim.text.toString())
            bundle.putString("nama", namam.text.toString())
            bundle.putString("email", emailm.text.toString())
            bundle.putString("alamat", alamatm.text.toString())
            val intent = Intent(this, intenexplicit_mahasiswa::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        btnbatal.setOnClickListener {
            val intent = Intent(this,beranda::class.java)
            startActivity(intent)
        }
    }
}