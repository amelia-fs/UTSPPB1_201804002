package com.example.uts_amel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class remahasiswa : AppCompatActivity() {
    private lateinit var rvMahasiswa: RecyclerView
    private var list: ArrayList<Mahasiswa> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remahasiswa)
        rvMahasiswa = findViewById(R.id.rv_mahasiswa)
        rvMahasiswa.setHasFixedSize(true)

        list.addAll(DataMahasiswa.listDataM)
        showRecyclerM()
    }
    private fun showRecyclerM(){
        rvMahasiswa.layoutManager = LinearLayoutManager(this)
        val listMahasiswaAdapter = ListMahasiswaAdapter(list)
        rvMahasiswa.adapter = listMahasiswaAdapter
    }
}
