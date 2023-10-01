package com.example.assinafacil.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assinafacil.dataBase.AppData
import com.example.assinafacil.databinding.ActivityListaJornadasBinding
import com.example.assinafacil.ui.activity.recyclerview.adapter.ListaJornadaAdapter

class ListaJornadasActivity : AppCompatActivity() {
    private val db = AppData.getInstance(this)
    private val dao = db.JornadasDao()
    private val adapter = ListaJornadaAdapter(context = this, tornadoes = dao.getAll())
    private val binding by lazy {
        ActivityListaJornadasBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
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