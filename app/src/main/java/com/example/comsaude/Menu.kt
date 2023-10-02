package com.example.comsaude

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btImc = findViewById<Button>(R.id.button1)

        btImc.setOnClickListener {
            entrada()
        }

        val btMeditacao = findViewById<Button>(R.id.button2)

        btMeditacao.setOnClickListener {
            entrada2()
        }

        val btExercicios = findViewById<Button>(R.id.button3)

        btExercicios.setOnClickListener {
            entrada3()
        }

        val btAgua = findViewById<Button>(R.id.button4)

        btAgua.setOnClickListener {
            entrada4()
        }

    }

    private fun entrada(){
        val imc = Intent(this, IMC::class.java)
        startActivity(imc)
    }

    private fun entrada2(){
        val meditacao = Intent(this, Meditação::class.java)
        startActivity(meditacao)
    }

    private fun entrada3(){
        val exercicios = Intent(this, Exercícios::class.java)
        startActivity(exercicios)
    }

    private fun entrada4(){
        val agua = Intent(this, BeberÁgua::class.java)
        startActivity(agua)
    }

}