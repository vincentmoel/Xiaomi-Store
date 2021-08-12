package com.vincent.xiaomistore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailXiaomi : AppCompatActivity() {

    companion object {
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_SPESIFIKASI = "extra_spesifikasi"
        const val EXTRA_HARGA = "extra_harga"
        const val EXTRA_MOREINFO = "extra_moreinfo"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_xiaomi)

        //tombol back
        setContentView(R.layout.activity_detail_xiaomi)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)




        val imgDetailProduk : ImageView = findViewById(R.id.img_detail_produk)
        val tvDetailNama : TextView = findViewById(R.id.tv_detail_nama)
        val tvDetailSpesifikasi : TextView = findViewById(R.id.tv_detail_spesifikasi)
        val tvDetailHarga : TextView = findViewById(R.id.tv_detail_harga)
        val tvDetailMoreInfo : TextView = findViewById(R.id.tv_detail_more_info)

        // buat gambar
        val bundle: Bundle? = intent.extras
        val detailImage: Int = bundle?.getInt(EXTRA_IMAGE) ?: 0

        // buat text
        val detailNama = intent.getStringExtra(EXTRA_NAMA)
        val detailSpesifikasi = intent.getStringExtra(EXTRA_SPESIFIKASI)
        val detailHarga = intent.getStringExtra(EXTRA_HARGA)
        val detailMoreInfo = intent.getStringExtra(EXTRA_MOREINFO)


        imgDetailProduk.setImageResource(detailImage)
        tvDetailNama.text = detailNama
        tvDetailSpesifikasi.text = detailSpesifikasi
        tvDetailHarga.text = detailHarga
        tvDetailMoreInfo.text = detailMoreInfo



    }


}