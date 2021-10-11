package com.example.aula1e2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class tela3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val tvTela3 = findViewById<TextView>(R.id.tvTela3)
        val btTela3segunda = findViewById<Button>(R.id.btTela3Segunda)

        btTela3segunda.setOnClickListener {
            val segundaTela = Intent(this,tela2Activity::class.java)
            startActivity(segundaTela)
        }
    }
}