package com.example.loginappcom437

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class SuccessActivity : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        firebaseAuth = FirebaseAuth.getInstance()

        val successMessage: TextView = findViewById(R.id.success_message)
        val userEmail: TextView = findViewById(R.id.user_email)
        val logoutBtn: Button = findViewById(R.id.logout_btn)

        // Obtener usuario autenticado
        val currentUser = firebaseAuth.currentUser

        // Si no hay usuario (por ejemplo, refrescaron actividad), enviar a login
        if (currentUser == null) {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
            return
        }

        // Mostrar mensaje usando su email real
        val email = currentUser.email ?: "Usuario"

        successMessage.text = "Bienvenido 👋"
        userEmail.text = email

        // Botón de cerrar sesión
        logoutBtn.setOnClickListener {
            firebaseAuth.signOut()

            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }
    }
}