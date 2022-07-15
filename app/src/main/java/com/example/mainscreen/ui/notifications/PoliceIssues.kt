package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.R

class PoliceIssues : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_police_issues)
    }

    fun poliss(view: View){
        intent = Intent(this, Police_issues2::class.java)
        startActivity (intent)
    }

    fun nobertwomoshennik(view: View){
        intent = Intent(this, NombertwoMoshennik::class.java)
        startActivity (intent)
    }

    fun nobertwocallpolicedouble(view: View){
        intent = Intent(this, NumbertwoCallPoliceDouble::class.java)
        startActivity (intent)
    }

}