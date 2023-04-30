package com.example.a10120236latihan2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
//Tanggal Pengerjaan    : 26 April 2023
//Deskripsi Pekerjaan   : Main Activity untuk layout halaman_registrasi
//NIM                   : 10120236
//Nama                  : Zulfikar Azizan
//Kelas                 : IF-6
class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide();
        super.onCreate(savedInstanceState)
        setContentView(R.layout.halaman_registrasi)

        val btnClick : Button = findViewById(R.id.btn_register)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0 != null) {
            when (p0.id) {
                R.id.btn_register -> {
                    val pindahIntent = Intent(this, MainActivity3::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}