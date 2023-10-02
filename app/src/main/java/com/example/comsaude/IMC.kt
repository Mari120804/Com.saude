package com.example.comsaude

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class IMC : AppCompatActivity() {

    private lateinit var editPeso: EditText
    private lateinit var editAltura: EditText
    private lateinit var btnCalcular: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)


        editPeso = findViewById(R.id.editPeso)
        editAltura = findViewById(R.id.editAltura)
        btnCalcular = findViewById(R.id.btnCalcular)
        textResultado = findViewById(R.id.textResultado)

        btnCalcular.setOnClickListener {
            calcularIMC()
        }


    }


    private fun calcularIMC() {
        val pesoStr = editPeso.text.toString()
        val alturaStr = editAltura.text.toString()

        if (pesoStr.isNotEmpty() && alturaStr.isNotEmpty()) {
            val peso = pesoStr.toFloat()
            val altura = alturaStr.toFloat()

            val imc = peso / (altura * altura)

            val resultado = when {
                imc < 18.5 -> "peso muito baixo. Aumente a ingestão de alimentos ricos em vitaminas e minerais de boa qualidade."
                imc < 24.9 -> "peso normal, muito bom!"
                imc < 29.9 -> "sobrepeso. Evite ingerir alimentos e bebidas em excesso."
                imc < 34.9 -> "obesidade grau 1. Evite comer alimentos processados e ricos em gordura trans."
                imc < 39.9 -> "obesidade grau 2. Coma somente alimentos ricos em vitaminas e minerais."
                else -> "obesidade grau 3. Faça exercícios físicos para aumentar o gasto calórico e aumentar o metabolismo."
            }

            val mensagem = "O seu IMC é %.2f , o que indica $resultado".format(imc)
            textResultado.text = mensagem
        } else {
            textResultado.text = "Preencha o peso e a altura."
        }

        val btRefeicao = findViewById<Button>(R.id.button2)


        btRefeicao.setOnClickListener {
            proxima()
        }

    }

    private fun proxima() {
        val refeicao = Intent(this,Receitas::class.java)
        startActivity(refeicao)
    }


}

