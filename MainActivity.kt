package com.example.vizesinavayoneliktarihcalismasi

import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var DatePicker: DatePicker
    lateinit var textViewTarih: TextView
    lateinit var buttonGonder: Button

    fun init(){
        DatePicker = findViewById(R.id.DatePicker)
        textViewTarih = findViewById(R.id.textViewTarih)
        buttonGonder = findViewById(R.id.buttonGonder)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        // Bu bilgisayarda Bu kod Çalıştı :

       var bugun = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
           Calendar.getInstance()
       } else {
           TODO("VERSION.SDK_INT < N")
       }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            DatePicker.setOnDateChangedListener { view, year, monthOfYear, dayOfMonth ->
                textViewTarih.text = (bugun.get(Calendar.YEAR) - year).toString()
            }
        }


        /* Okuldaki bilgisayarda aşağıdaki çalışabilir !


         var bugun = Calendar.getInstance()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            DatePicker.setOnDateChangedListener { view, year, monthOfYear, dayOfMonth ->
                textViewTarih.text = (bugun.get(Calendar.YEAR) - year).toString()
            }
        }
         */


    }
}