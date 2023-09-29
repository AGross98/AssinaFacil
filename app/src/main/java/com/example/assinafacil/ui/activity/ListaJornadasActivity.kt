package com.example.assinafacil.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.assinafacil.R
import com.example.assinafacil.dao.JornadasDao
import com.example.assinafacil.databinding.ActivityListaJornadasBinding
import com.example.assinafacil.model.Jornada
import com.example.assinafacil.ui.activity.recyclerview.adapter.ListaJornadaAdapter
import database.AppDataBase

class ListaJornadasActivity : AppCompatActivity() {
    private lateinit var dao : JornadasDao
    private val adapter = ListaJornadaAdapter(context = this, jornadas = dao.getAll())
    private val binding by lazy{
        ActivityListaJornadasBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDataBase::class.java, "db"
        ).build()
        dao = db.jornadasDao()
        configuraRecyclertView()
    }

    override fun onResume() {
        super.onResume()
        adapter.atualiza(dao.getAll())
    }

    private fun configuraRecyclertView() {
        val recyclerView = binding.recyclerView
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}