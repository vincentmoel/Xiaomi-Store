package com.vincent.xiaomistore

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
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


}