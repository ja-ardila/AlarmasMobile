package com.example.alarmasmobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RegistroCaminata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_caminata)

        val back = findViewById<View>(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val pasosInput = findViewById<EditText>(R.id.edit_pasos)
        val guardar = findViewById<ImageView>(R.id.boton_guardar)

        guardar.setOnClickListener{
            val pasosIngresados = pasosInput.text.toString()
            val intent = Intent(this, ResumenCaminata::class.java)
            intent.putExtra("PASOS_INGRESADOS", pasosIngresados)
            startActivity(intent)
        }
    }
}