package com.vincent.xiaomistore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListXiaomiAdapter(private val listXiaomi: ArrayList<Xiaomi>) : RecyclerView.Adapter<ListXiaomiAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(
            R.layout.xiaomi_phone_list,
            viewGroup,
            false
        )
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hpXiaomi = listXiaomi[position]
        Glide.with(holder.itemView.context)
            .load(hpXiaomi.image)
//            .apply(RequestOptions().override(110, 110))
            .apply(RequestOptions())
            .into(holder.imgGambarProduk)
        holder.tvNama.text = hpXiaomi.name
        holder.tvSpesifikasi.text = hpXiaomi.specification
        holder.tvHarga.text = hpXiaomi.price
    }

    override fun getItemCount(): Int {
        return listXiaomi.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var imgGambarProduk : ImageView = itemView.findViewById(R.id.img_gambar_produk)
        var tvNama : TextView = itemView.findViewById(R.id.tv_nama_produk)
        var tvSpesifikasi : TextView = itemView.findViewById(R.id.tv_spesifikasi_produk)
        var tvHarga : TextView = itemView.findViewById(R.id.tv_harga_produk)
    }

}