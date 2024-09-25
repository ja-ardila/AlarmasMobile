package com.example.alarmasmobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResumenCaminata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen_caminata)

        // Obtener la referencia al TextView
        val pasosRecibidos = findViewById<TextView>(R.id.pasos)

        // Obtener el texto del Intent
        val pasosIngresados = intent.getStringExtra("PASOS_INGRESADOS")

        // Mostrar el texto en el TextView
        pasosRecibidos.text = pasosIngresados

        val back = findViewById<View>(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val inicio = findViewById<ImageView>(R.id.btn_inicio)
        inicio.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}