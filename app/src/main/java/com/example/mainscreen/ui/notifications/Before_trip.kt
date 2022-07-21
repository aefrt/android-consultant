package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.R

class Before_trip : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_before_trip)
    }
    fun contr(view: View) {
        intent = Intent(this, Contract::class.java)
        startActivity(intent)
    }

    fun need_zalog(view: View) {
        intent = Intent(this, Zalog::class.java)
        startActivity(intent)
    }

    fun insurance(view: View) {
        intent = Intent(this, Save::class.java)
        startActivity(intent)
    }

    fun which_info(view: View) {
        intent = Intent(this, Info::class.java)
        startActivity(intent)
    }

}