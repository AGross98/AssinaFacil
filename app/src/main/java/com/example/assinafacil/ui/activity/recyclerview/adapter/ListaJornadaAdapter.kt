package com.example.assinafacil.ui.activity.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assinafacil.databinding.ActivityJornadaBinding
import com.example.assinafacil.model.Jornada

class ListaJornadaAdapter(
    private val context: Context,
    tornadoes: List<Jornada>
) : RecyclerView.Adapter<ListaJornadaAdapter.ViewHolder>() {
    private val jornadas = tornadoes.toMutableList()

    class ViewHolder(private val binding: ActivityJornadaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun vincula(jornada: Jornada) {
            val dataHora = binding.jornadaDataEHora
            dataHora.text = jornada.dataHora
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflador = LayoutInflater.from(context)
        val binding = ActivityJornadaBinding.inflate(inflador,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val jornada = jornadas[position]
        holder.vincula(jornada)
    }

    override fun getItemCount(): Int = jornadas.size

    fun atualiza(jornada: List<Jornada>) {
        this.jornadas.clear()
        this.jornadas.addAll(jornada)
        notifyDataSetChanged()
    }
}