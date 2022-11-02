package com.example.kolejka_i_stos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.LinkedList
import java.util.Queue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kolejka: Queue<Int> = LinkedList<Int>()
        val butt_dodaj_do_kolejki = findViewById<Button>(R.id.dodaj_kolejka)
        val butt_usun_z_kolejki = findViewById<Button>(R.id.usun_kolejka)
        val txt_ile_w_kolejce = findViewById<TextView>(R.id.ile_w_kolejce)
        val txt_pierwszy_w_kolejce = findViewById<TextView>(R.id.pierwszy_w_kolejce)
        val txt_ostatni_w_kolejce = findViewById<TextView>(R.id.ostatni_w_kolejce)


    }
}