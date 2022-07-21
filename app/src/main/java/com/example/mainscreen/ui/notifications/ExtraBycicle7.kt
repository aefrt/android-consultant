package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.R

class ExtraBycicle7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra_bycicle7)
    }

    fun bycicleProtocolHowTo(view : View) {
        intent = Intent(this, Protocol::class.java)
        startActivity(intent)
    }
}