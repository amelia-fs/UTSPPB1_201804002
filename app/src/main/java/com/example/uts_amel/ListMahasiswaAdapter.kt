package com.example.uts_amel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMahasiswaAdapter(private val listMhs: ArrayList<Mahasiswa>): RecyclerView.Adapter<ListMahasiswaAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvnim: TextView = itemView.findViewById(R.id.tv_nim)
        var tvnama: TextView = itemView.findViewById(R.id.tv_namamhs)
        var tvemail: TextView = itemView.findViewById(R.id.tv_emailmhs)
        var tvalamat: TextView = itemView.findViewById(R.id.tv_alamatmhs)
        var ivfoto: ImageView = itemView.findViewById(R.id.civ_mahasiswa)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View  = LayoutInflater.from(parent.context).inflate(R.layout.activity_item_mahasiswa,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMhs.size
    }

    override fun onBindViewHolder(holder: ListMahasiswaAdapter.ListViewHolder, position: Int) {
        val mhs = listMhs[position]

        Glide.with(holder.itemView.context)
            .load(mhs.fotomhs)
            .apply(RequestOptions().override(60,60))
            .into(holder.ivfoto)
        holder.tvnim.text = mhs.nimmhs
        holder.tvnama.text = mhs.namamhs
        holder.tvemail.text = mhs.emailmhs
        holder.tvalamat.text = mhs.alamatmhs
    }

}
