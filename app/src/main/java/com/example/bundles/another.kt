package com.example.bundles

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class another : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
        val name = findViewById<TextView>(R.id.name)
        val e_mail = findViewById<TextView>(R.id.e_mail)
        val password = findViewById<TextView>(R.id.password)

        val intent = intent
        val names :String? = intent.getStringExtra("name")
        val e_mails : String? = intent .getStringExtra("e_mail")
        val passwords : String? = intent.getStringExtra("password")

        name.text = "Name: $names"
        e_mail.text = "e_mail: $e_mails "
        password.text="password: $passwords"
    }
}