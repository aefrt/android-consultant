package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.R

class Extra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra)
    }

    fun more1(view: View) {
        intent = Intent(this, More1::class.java)
        startActivity(intent)
    }

    fun more2(view: View) {
        intent = Intent(this, More2::class.java)
        startActivity(intent)
    }

    fun more3(view: View) {
        intent = Intent(this, More3::class.java)
        startActivity(intent)
    }
}