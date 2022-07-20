package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.R

class More2Button1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more2_button1)
    }

    fun button1(view : View) {
        intent = Intent(this, Koap2742245::class.java)
        startActivity(intent)
    }

    fun button2(view : View) {
        intent = Intent(this, Konst51::class.java)
        startActivity(intent)
    }

    fun button3(view : View) {
        intent = Intent(this, Adm51132::class.java)
        startActivity(intent)
    }
}