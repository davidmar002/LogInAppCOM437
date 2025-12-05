package com.example.loginappcom437

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: Button
    lateinit var registerLink: TextView

    lateinit var facebookBtn: ImageView
    lateinit var instagramBtn: ImageView
    lateinit var linkedinBtn: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        val currentUser = auth.currentUser
        if (currentUser != null) {
            goToSuccessScreen(currentUser.email ?: "Usuario")
            return
        }

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)
        registerLink = findViewById(R.id.register_link)

        facebookBtn = findViewById(R.id.facebook_btn)
        instagramBtn = findViewById(R.id.instagram_btn)
        linkedinBtn = findViewById(R.id.linkedin_btn)

        // ✅ Login Firebase
        loginBtn.setOnClickListener {
            val email = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor ingrese correo y contraseña", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
                        goToSuccessScreen(email)
                    } else {
                        Toast.makeText(
                            this,
                            "Error: ${task.exception?.message}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
        }

        // ✅ IR A REGISTRO
        registerLink.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // ✅ Botones de redes sociales funcionales (Abren navegador para cada red social)

        facebookBtn.setOnClickListener {
            openWeb("https://www.facebook.com")
        }

        instagramBtn.setOnClickListener {
            openWeb("https://www.instagram.com")
        }

        linkedinBtn.setOnClickListener {
            openWeb("https://www.linkedin.com")
        }
    }

    private fun goToSuccessScreen(email: String) {
        val intent = Intent(this, SuccessActivity::class.java)
        intent.putExtra("USER_EMAIL", email)
        startActivity(intent)
        finish()
    }

    // ✅ Funcion para que los botones de redes abran el navegador
    private fun openWeb(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}
