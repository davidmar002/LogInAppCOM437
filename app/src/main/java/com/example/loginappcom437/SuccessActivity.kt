package com.example.loginappcom437

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class SuccessActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        // Obtiene el nombre de usuario del intent
        val username = intent.getStringExtra("USERNAME") ?: "Usuario"

        val successMessage: TextView = findViewById(R.id.success_message)
        val userEmail: TextView = findViewById(R.id.user_email)
        val logoutBtn: Button = findViewById(R.id.logout_btn)

        // Muestra la información del usuario
        successMessage.text = "Bienvenido, $username 👋"
        userEmail.text = "$username@example.com"

        // Acción del botón "Salir": regresa al login (MainActivity)
        logoutBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }
    }
}