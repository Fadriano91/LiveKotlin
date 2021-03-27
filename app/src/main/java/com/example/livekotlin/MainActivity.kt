package com.example.livekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItemsLista()
    }

    private fun iniciaViews() {
        rvList = findViewById(R.id.rv_List)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)
    }

    private fun setItemsLista(){
        adapter.setItensList(
            arrayListOf(
                MenuItemModel(
                        titulo = "cartões"
                ),
                MenuItemModel(
                        titulo = "meus comprovantes"
                ),
                MenuItemModel(
                        titulo = "investimentos"
                ),
                MenuItemModel(
                        titulo = "portabilidade de salário"
                ),
                MenuItemModel(
                        titulo = "cartões"
                ),
                MenuItemModel(
                        titulo = "meus comprovantes"
                ),
                MenuItemModel(
                        titulo = "investimentos"
                ),
                MenuItemModel(
                        titulo = "portabilidade de salário"
                )
            )
        )
    }
}