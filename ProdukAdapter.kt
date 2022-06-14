package com.example.deshopprojectakhir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProdukAdapter: RecyclerView.Adapter<ProdukAdapter.ViewHolder>() {
    private var foto = intArrayOf(R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5)
    private var nama_produk = arrayOf("Sepatu Sneakers Wanita Sport Shoes Candy KSM 01","Sepatu Wanita Fhasion Sepatu Cantik Sneakers Korea KSM 14", "Sepatu Kanvas Wanita Sepatu Canvas cewek Bertali Best Seller Model Versi Korea", "Sepatu Wanita Terbaru Sneakers cewek Impor PANARYBODY J708 Korea Style Sepatu", "New Sepatu Sneakers Wanita Sepatu Import Casual Wear ala Korea Import")
    private var harga = arrayOf("Rp.150.000", "Rp.120.000", "Rp.170.000", "Rp.190.000", "Rp.250.000")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //instance pallete cardview
        var itemFoto: ImageView
        var nama_Produk: TextView
        var harga: TextView

        init {
            itemFoto = itemView.findViewById(R.id.foto)
            nama_Produk = itemView.findViewById(R.id.nama_produk)
            harga = itemView.findViewById(R.id.harga)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_produk, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemFoto.setImageResource(foto[position])
        holder.nama_Produk.text = nama_produk[position]
        holder.harga.text = harga[position]
    }

    override fun getItemCount(): Int {
        //digunakan untuk menghitung jumlah data yang kita punya
        return harga.size

    }
}