package com.example.aula1e2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edTela1Nome = findViewById<EditText>(R.id.edTela1Nome)
        val tvResultadoTela1 = findViewById<TextView>(R.id.tvResultadoTela1)
        val btEnviarTela1 = findViewById<Button>(R.id.btEnviarTela1)
        val btTela1SegundaTela = findViewById<Button>(R.id.btTela1SegundaTela)

        btEnviarTela1.setOnClickListener {
            if (edTela1Nome.text.isNotBlank()) {
                tvResultadoTela1.text =
                    "Seja bem vindo ${edTela1Nome.text.toString()} ao curso de Android!!"
            } else {
                edTela1Nome.error = "Não deixe o campo em branco"
            }
            btTela1SegundaTela.setOnClickListener {
                val segundaTela = Intent(this, tela2Activity::class.java)
                segundaTela.putExtra("ENVIAR_MSG", tvResultadoTela1.text)
                //val enviarMsgTela2 = findViewById<TextView>(R.id.tvTela2)
                //enviarMsgTela2.text = tvResultadoTela1.text
                startActivity(segundaTela)
            }
        }
    }
}