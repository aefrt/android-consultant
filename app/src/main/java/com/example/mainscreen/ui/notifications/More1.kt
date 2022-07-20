package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.R

class More1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more1)
    }

    fun buttonPt1(view : View) {
        intent = Intent(this, Pdd611::class.java)
        startActivity(intent)
    }

    fun buttonPt2(view : View) {
        intent = Intent(this, Koap12252::class.java)
        startActivity(intent)
    }
}