package com.example.comsaude

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Meditação : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditacao)

        val btIndicacao = findViewById<Button>(R.id.button1)

        btIndicacao.setOnClickListener {
            entrada()
        }

    }

    private fun entrada(){
        val Indicacao = Intent(this, Mantras::class.java)
        startActivity(Indicacao)
    }

}
