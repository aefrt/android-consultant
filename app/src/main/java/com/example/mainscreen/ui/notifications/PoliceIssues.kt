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

    // Экран 5

    fun vzyatkaVymog(view: View) {
        intent = Intent(this, VzyatkaVymog::class.java)
        startActivity(intent)
    }

    fun vzyatkaDat(view: View) {
        intent = Intent(this, VzyatkaDat::class.java)
        startActivity(intent)
    }

    // Экран 6
    // https://www.geeksforgeeks.org/how-to-make-substring-of-a-textview-clickable-in-android/ <- вот так будет достаточно
    // Osmotr, Vskrytie, Dosmotr
}