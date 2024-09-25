package com.example.alarmasmobile

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AlarmaHidratacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarma_hidratacion)

        // Encontrar el botón por su ID y establecer el onClickListener
        val detener = findViewById<ImageView>(R.id.boton_detener)
        detener.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}