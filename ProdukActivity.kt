package com.example.deshopprojectakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProdukActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager?=null
    private var adapter: RecyclerView.Adapter<ProdukAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produk)

        //set layout menjadi linear layout
        layoutManager = LinearLayoutManager(this)

        //instance Recyclerview
        var recyclerviewProduk: RecyclerView = findViewById(R.id.recyclerviewProduk)

        //set layout untuk recyclerview
        recyclerviewProduk.layoutManager = layoutManager

        //panggil class adapter dan set recyclerview sesuai dengan adapter yang telah dibuat
        adapter = ProdukAdapter()
        recyclerviewProduk.adapter = adapter
    }
}