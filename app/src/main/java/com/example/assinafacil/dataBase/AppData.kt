package com.example.assinafacil.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.assinafacil.dao.JornadasDao
import com.example.assinafacil.model.Jornada

@Database(entities = [Jornada::class], version = 1)
abstract class AppData : RoomDatabase() {
    abstract fun JornadasDao(): JornadasDao

    companion object {
        fun getInstance(context: Context): AppData {
            return Room.databaseBuilder(
                context,
                AppData::class.java,
                "assinafacil.db"
            ).allowMainThreadQueries()
                .build()
        }
    }


}


