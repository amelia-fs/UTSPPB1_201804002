package com.example.uts_amel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListDosenAdapter(private val listDosen: ArrayList<Dosen>) : RecyclerView.Adapter<ListDosenAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvnip: TextView = itemView.findViewById(R.id.tv_nipdos)
        var tvnama: TextView = itemView.findViewById(R.id.tv_namados)
        var tvemail: TextView = itemView.findViewById(R.id.tv_emaildos)
        var tvalamat: TextView = itemView.findViewById(R.id.tv_alamatdos)
        var ivfoto: ImageView = itemView.findViewById(R.id.civ_dosen)
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View  = LayoutInflater.from(parent.context).inflate(R.layout.activity_item_dosen,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDosen.size
    }

    override fun onBindViewHolder(holder: ListDosenAdapter.ListViewHolder, position: Int) {
        val dosen = listDosen[position]

        Glide.with(holder.itemView.context)
            .load(dosen.fotodosen)
            .apply(RequestOptions().override(60,60))
            .into(holder.ivfoto)
        holder.tvnip.text = dosen.nipdosen
        holder.tvnama.text = dosen.namadosen
        holder.tvemail.text = dosen.emaildosen
        holder.tvalamat.text = dosen.alamatdosen
    }
}