package com.example.assinafacil.dao

import com.example.assinafacil.model.Jornada

class JornadasDao {

    fun registra(jornada: Jornada){
        jornadas.add(jornada)
    }

    fun buscaJornadas(): List<Jornada>{
        return jornadas.toList()
    }

    companion object{
        private val jornadas = mutableListOf<Jornada>(
            Jornada(
                dataHora = "28/03/2023 18:53"
            )
        )
    }

}
