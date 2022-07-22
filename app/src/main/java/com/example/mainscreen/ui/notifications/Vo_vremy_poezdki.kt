package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.MainActivity
import com.example.mainscreen.R

class Vo_vremy_poezdki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vo_vremy_poezdki)
    }

    fun extra5(view : View){
        intent = Intent(this, ExtraBycicle5::class.java)
        startActivity(intent)
    }

    fun extra6(view : View){
        intent = Intent(this, ExtraBycicle6::class.java)
        startActivity(intent)
    }

    fun extra7(view : View){
        intent = Intent(this, ExtraBycicle7::class.java)
        startActivity(intent)
    }

    fun extra8(view : View){
        intent = Intent(this, ExtraBycicle8::class.java)
        startActivity(intent)
    }

    fun goHome(view : View){
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}