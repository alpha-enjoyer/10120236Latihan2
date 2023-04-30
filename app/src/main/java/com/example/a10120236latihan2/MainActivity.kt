package com.example.a10120236latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
//Tanggal Pengerjaan    : 26 April 2023
//Deskripsi Pekerjaan   : Main Activity untuk layout activity_main
//NIM                   : 10120236
//Nama                  : Zulfikar Azizan
//Kelas                 : IF-6
class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.hide();
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick: Button = findViewById(R.id.register)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0 != null) {
            when (p0.id) {
                R.id.register -> {
                    val pindahIntent = Intent(this, MainActivity2::class.java)
                    startActivity(pindahIntent)
                }
            }
        }

    }


}