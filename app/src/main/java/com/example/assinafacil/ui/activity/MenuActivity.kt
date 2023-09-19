package com.example.assinafacil.ui.activity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.assinafacil.R
import com.example.assinafacil.databinding.ActivityMenuBinding
import java.text.DateFormat
import java.util.Calendar


class MenuActivity : AppCompatActivity() {
    //DateFormat.getInstance().format(Calendar.getInstance().time)
    private val binding by lazy {
        ActivityMenuBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.menuRegistrarJornada.setOnClickListener{
            registraJornada()
        }
}

    private fun registraJornada() {

        val jornada = DateFormat.getInstance().format(Calendar.getInstance().time)

        AlertDialog.Builder(this)
            .setTitle("Registrar Jornada")
            .setMessage("Jornada registrada:" + jornada)
            .setPositiveButton("Confirmar", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(applicationContext,"Jornada Registrada:" + jornada, Toast.LENGTH_SHORT).show()
            })
            .setNegativeButton("Cancelar"){_, _ ->

            }
            .create()
            .show()
        }
    }
