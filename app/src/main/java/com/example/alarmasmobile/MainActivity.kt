package com.example.alarmasmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Boton para cambiar a alarma hidratación
        val alarma_hidratacion = findViewById<Button>(R.id.pantalla_alarma_hidratacion)
        alarma_hidratacion.setOnClickListener {
            val intent = Intent(this, AlarmaHidratacion::class.java)
            startActivity(intent)
        }

        //Botón para cambiar a registro de caminata
        val registro_caminata = findViewById<Button>(R.id.pantalla_registro_caminata)
        registro_caminata.setOnClickListener {
            val intent = Intent(this, RegistroCaminata::class.java)
            startActivity(intent)
        }
    }
}