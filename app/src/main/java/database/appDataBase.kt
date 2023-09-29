package database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.assinafacil.dao.JornadasDao
import com.example.assinafacil.model.Jornada

@Database(entities=[Jornada::class],version=1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun jornadasDao() : JornadasDao

}