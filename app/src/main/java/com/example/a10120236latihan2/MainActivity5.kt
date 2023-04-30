package com.example.a10120236latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Tanggal Pengerjaan    : 26 April 2023
//Deskripsi Pekerjaan   : Main Activity untuk layout profil
//NIM                   : 10120236
//Nama                  : Zulfikar Azizan
//Kelas                 : IF-6
class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide();
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profil)
    }
}