package com.example.aula1e2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val tvTela2 = findViewById<TextView>(R.id.tvTela2)
        val btTela2PrimeiraTela = findViewById<Button>(R.id.btTela2PrimeiraTela)
        val btTela2TerceiraTela = findViewById<Button>(R.id.btTela2TerceiraTela)



        btTela2PrimeiraTela.setOnClickListener {
            val primeiraTela = Intent(this,MainActivity::class.java)
            startActivity(primeiraTela)
        }
        btTela2TerceiraTela.setOnClickListener {
            val terceiraTela = Intent(this,tela3Activity::class.java)
            startActivity(terceiraTela)
        }
    }
}