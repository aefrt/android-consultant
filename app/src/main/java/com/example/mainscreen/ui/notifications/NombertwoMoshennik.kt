package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.R

class NombertwoMoshennik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nombertwo_moshennik)
    }

    fun nobertwocallpolice(view: View){
        intent = Intent(this, NumbertwoCallPoliceDouble::class.java)
        startActivity (intent)
    }
}