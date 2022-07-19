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

    fun carextranumberfour(view: View) {
        intent = Intent(this, Car_extra_number4::class.java)
        startActivity(intent)
    }

    fun carextranumberfive(view: View) {
        intent = Intent(this, Car_extra_number5::class.java)
        startActivity(intent)
    }

    fun carextranumbersixone(view: View) {
        intent = Intent(this, Car_extra_number6::class.java)
        startActivity(intent)
    }

    fun carextranumbersixtwo(view: View) {
        intent = Intent(this, Car_extra_number62::class.java)
        startActivity(intent)
    }

    fun carextranumbersixthree(view: View) {
        intent = Intent(this, Car_extra_number63::class.java)
        startActivity(intent)
    }

}