package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.R

class Menu_instructions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_instructions)


    }
    fun calm(view: View){
        intent = Intent(this, PoliceIssues::class.java)
        startActivity (intent)
    }

    fun extra(view: View){
        intent = Intent(this, Extra::class.java)
        startActivity (intent)
    }
}