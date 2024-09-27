package com.example.alarmasmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // Corrected parameter name
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val iniciar_sesion = findViewById<Button>(R.id.IniciarSesion)
        iniciar_sesion.setOnClickListener {
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
        }
    }
}