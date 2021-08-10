package com.vincent.xiaomistore

import android.os.Bundle
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

}