package com.example.assinafacil.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.assinafacil.model.Jornada

@Dao
interface JornadasDao {

    @Query("SELECT * FROM jornada")
    fun getAll(): List<Jornada>

    @Insert
    fun salvar(vararg jornada: Jornada)

}
