package com.example.uts_amel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class redosen : AppCompatActivity() {
    private lateinit var rvDosen: RecyclerView
    private var list: ArrayList<Dosen> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_redosen)

        rvDosen = findViewById(R.id.rv_dosen)
        rvDosen.setHasFixedSize(true)

        list.addAll(DataDosen.listData)
        showRecycler()
    }
    private fun showRecycler(){
        rvDosen.layoutManager = LinearLayoutManager(this)
        val listDosenAdapter = ListDosenAdapter(list)
        rvDosen.adapter = listDosenAdapter
    }
}