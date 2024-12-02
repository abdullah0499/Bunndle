package com.example.bundles

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name : EditText = findViewById<EditText>(R.id.editTextName)
        val e_mail : EditText = findViewById<EditText>(R.id.edittxt_e_mail)
        val password : EditText = findViewById<EditText>(R.id.edittxt_password)
        val button = findViewById<Button>(R.id.button)

         button.setOnClickListener {
           val name:String = name.text.toString()
           val e_mail:String = e_mail.text.toString()
           val password:String = password.text.toString()

             val intent = Intent(this,another::class.java)
             intent.putExtra("name",name)
             intent.putExtra("e_mail",e_mail)
             intent.putExtra("password",password)
             startActivity(intent)
         }
    }
}