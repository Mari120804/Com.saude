package com.example.comsaude

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Mantras : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mantras)

        val linkTextView = findViewById<TextView>(R.id.linkTextView2)

        linkTextView.setOnClickListener {
            val url = "https://youtu.be/7IXjdTSNmC0?si=XgvR_sKpeLuqMEQd"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val linkTextView2 = findViewById<TextView>(R.id.linkTextView3)

        linkTextView2.setOnClickListener {
            val url = "https://youtu.be/PMQi-u8dSBE?si=QiSPnCcIqj2e8l1x"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val linkTextView3 = findViewById<TextView>(R.id.linkTextView4)

        linkTextView3.setOnClickListener {
            val url = "https://youtu.be/rozfME4G8hg?si=RRNZTqv4xIsNKzn5"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val linkTextView4 = findViewById<TextView>(R.id.linkTextView5)

        linkTextView4.setOnClickListener {
            val url = "https://youtu.be/6SEyqH6zBGQ?si=d-nn2oBfAbPRYwoh"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val linkTextView5 = findViewById<TextView>(R.id.linkTextView6)

        linkTextView5.setOnClickListener {
            val url = "https://youtu.be/kEElYUeudU0?si=hD2JuTS4EYiFWwKw"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val linkTextView6 = findViewById<TextView>(R.id.linkTextView7)

        linkTextView6.setOnClickListener {
            val url = "https://youtu.be/cwcF4HhIhto?si=H4k10wrR6IYS2Uqs"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val linkTextView7 = findViewById<TextView>(R.id.linkTextView8)

        linkTextView7.setOnClickListener {
            val url = "https://youtu.be/0XdzLJuKeMY?si=0W2E1wPFaMD0Ch5p"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val linkTextView8 = findViewById<TextView>(R.id.linkTextView9)

        linkTextView8.setOnClickListener {
            val url = "https://youtu.be/PyaIhtljuco?si=Lze20FCJguMZUB6o"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val linkTextView9 = findViewById<TextView>(R.id.linkTextView10)

        linkTextView9.setOnClickListener {
            val url = "https://youtu.be/77yqxFx9x04?si=hbuvhbdFWlYhiyrQ"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val linkTextView10 = findViewById<TextView>(R.id.linkTextView11)

        linkTextView10.setOnClickListener {
            val url = "https://youtu.be/7hQq7pu-7DY?si=CEx443UoArdX3Yw3"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

    }
}