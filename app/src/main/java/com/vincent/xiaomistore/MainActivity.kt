package com.vincent.xiaomistore

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvHpXiaomi: RecyclerView
    private var list: ArrayList<Xiaomi> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHpXiaomi = findViewById(R.id.rv_hp_xiaomi)
        rvHpXiaomi.setHasFixedSize(true)

        list.addAll(XiaomiData.listDataXiaomi)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvHpXiaomi.layoutManager = LinearLayoutManager(this)
        val listXiaomiAdapter = ListXiaomiAdapter(list)
        rvHpXiaomi.adapter = listXiaomiAdapter

        listXiaomiAdapter.setOnItemClickCallback(object : ListXiaomiAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Xiaomi) {
                showSelectedHero(data)
            }
        })

    }


    // Untuk Mengatur Option Menu Kanan Atas
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_profile, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_person -> {
                val moveIntent = Intent(this@MainActivity, MoveToProfile::class.java)
                startActivity(moveIntent)
            }

        }

    }

    // Selesai - Untuk Mengatur Option Menu Kanan Atas

    private fun showSelectedHero(hp: Xiaomi) {

        val moveWithDataIntent = Intent(this@MainActivity, DetailXiaomi::class.java)
        moveWithDataIntent.putExtra(DetailXiaomi.EXTRA_IMAGE,hp.image)
        moveWithDataIntent.putExtra(DetailXiaomi.EXTRA_NAMA, hp.name)
        moveWithDataIntent.putExtra(DetailXiaomi.EXTRA_SPESIFIKASI, hp.specification)
        moveWithDataIntent.putExtra(DetailXiaomi.EXTRA_HARGA, hp.price)
        moveWithDataIntent.putExtra(DetailXiaomi.EXTRA_MOREINFO, hp.detail)

        startActivity(moveWithDataIntent)
    }


}