package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.R

class More2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more2)
    }

    fun fine_more2(view : View) {
        intent = Intent(this, Fine::class.java)
        startActivity(intent)
    }

    fun button1(view : View) {
        intent = Intent(this, More2Button1::class.java)
        startActivity(intent)
    }

    fun button2(view : View) {
        intent = Intent(this, More2Button2::class.java)
        startActivity(intent)
    }

}