package com.example.kolejka_i_stos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.LinkedList
import java.util.Queue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //  ************************* KOLEJKA *************************
        val kolejka: Queue<Int> = LinkedList<Int>()
        val butt_dodaj_do_kolejki = findViewById<Button>(R.id.dodaj_kolejka)
        val butt_usun_z_kolejki = findViewById<Button>(R.id.usun_kolejka)
        val butt_pierw_i_ost_w_kolejce = findViewById<Button>(R.id.kto_w_kolejce)
        val txt_ile_w_kolejce = findViewById<TextView>(R.id.ile_w_kolejce)
        val txt_pierwszy_w_kolejce = findViewById<TextView>(R.id.pierwszy_w_kolejce)
        val txt_ostatni_w_kolejce = findViewById<TextView>(R.id.ostatni_w_kolejce)
        var pierw = 0
        var ost = 0
        val length = Toast.LENGTH_SHORT
        var numer = 1
        var ilosc_osob_w_kolejce = 0

        butt_dodaj_do_kolejki.setOnClickListener {
            Toast.makeText(applicationContext,"Twój numer to: " + numer, length).show()
            kolejka.add(numer)
            numer+=1
            ilosc_osob_w_kolejce+=1
            txt_ile_w_kolejce.text = ilosc_osob_w_kolejce.toString()
        }

        butt_usun_z_kolejki.setOnClickListener {
            if(!kolejka.isEmpty())
            {
                Toast.makeText(applicationContext,"Usunieto numer: " + kolejka.element() + " z kolejki!", length).show()
                kolejka.remove()
                ilosc_osob_w_kolejce -= 1
                txt_ile_w_kolejce.text = ilosc_osob_w_kolejce.toString()

            }
            else
            {
                Toast.makeText(applicationContext, "Brak osob w kolejce", length).show()
            }
        }
        butt_pierw_i_ost_w_kolejce.setOnClickListener {
            if(!kolejka.isEmpty())
            {
                pierw = kolejka.element()
                ost = kolejka.last()
                txt_pierwszy_w_kolejce.text = pierw.toString()
                txt_ostatni_w_kolejce.text = ost.toString()
            }
            else
            {
                Toast.makeText(applicationContext, "Brak osob w kolejce", length).show()
            }
        }



        //  ************************* STOS *************************

        val stos = LinkedList<Int>()
        val butt_dodaj_do_stosu = findViewById<Button>(R.id.dodaj_stos)
        val butt_usun_ze_stosu = findViewById<Button>(R.id.usun_stos)
        val butt_pierw_i_ost_w_stosie = findViewById<Button>(R.id.pierw_i_ost_ele_stosu)
        val edittext_dodaj_do_stosu = findViewById<EditText>(R.id.editText_dodaj_do_stosu)
        val txt_ile_w_stosie = findViewById<TextView>(R.id.ile_w_stosie)
        val txt_gora_stosu = findViewById<TextView>(R.id.gora_stosu)

        var ilosc_ele_w_stosie = 0


    }
}