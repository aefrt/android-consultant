package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.MainActivity
import com.example.mainscreen.R

class More2Button2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more2_button2)
    }

    fun goHome(view : View){
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}