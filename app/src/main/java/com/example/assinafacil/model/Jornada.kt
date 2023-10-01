package com.example.assinafacil.model

import android.provider.ContactsContract.RawContacts.Data
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Jornada (
    @PrimaryKey(autoGenerate = true) val id: Int = 0 ,
    val dataHora: String

)