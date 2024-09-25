package com.example.alarmasmobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encontrar el botón por su ID y establecer el onClickListener
        val boton = findViewById<Button>(R.id.button_prueba)
        boton.setOnClickListener {
            // Crear un intent para cambiar a la segunda actividad
            val intent = Intent(this, AlarmaHidratacion::class.java)
            startActivity(intent)  // Iniciar la segunda actividad
        }
    }
}