package com.example.uts_amel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_intenexplicit_dosen.*

class inputdosen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inputdosen)
        val nip: EditText = findViewById(R.id.nip)
        val namados: EditText = findViewById(R.id.nama)
        val emaildos: EditText = findViewById(R.id.email)
        val alamat: EditText = findViewById(R.id.alamat)
        val btnsimpan:Button = findViewById(R.id.btnsimpan)
        val btnbtl:Button = findViewById(R.id.btnbatal)

        btnsimpan.setOnClickListener {
            val bundle= Bundle()
            bundle.putString("nip", nip.text.toString())
            bundle.putString("nama", namados.text.toString())
            bundle.putString("email", emaildos.text.toString())
            bundle.putString("alamat", alamat.text.toString())
            val intent = Intent(this, intenexplicit_dosen::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        btnbtl.setOnClickListener {
            val intent = Intent(this,beranda::class.java)
            startActivity(intent)
        }
    }
}