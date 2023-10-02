package com.example.comsaude

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Receitas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receitas)

        val cafe: Button = findViewById(R.id.button1)
        val almoco: Button = findViewById(R.id.button2)
        val lanche: Button = findViewById(R.id.button3)
        val janta: Button = findViewById(R.id.button4)

        cafe.setOnClickListener(View.OnClickListener {
            abraLink("https://youtu.be/wnCy9eQ2iss?si=PshAZDtJkYD1YfbR")
        })

        almoco.setOnClickListener(View.OnClickListener {
            abraLink("https://youtu.be/9pN2zVUWHuA?si=HlCOSkgSs4oNqBNa")
        })

        lanche.setOnClickListener(View.OnClickListener {
            abraLink("https://youtu.be/8C9CmunKMBg?si=kN8Ko8d2FON7KjEA")
        })

        janta.setOnClickListener(View.OnClickListener {
            abraLink("https://youtu.be/Z7KAfqLXKLw?si=p0D2ep5CPYq-M5DR")
        })

    }

    private fun abraLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

}