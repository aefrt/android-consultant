package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.R

class Extra_bicycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra_bicycle)
    }

    fun bicyclezaversheniepoesdki(view : View) {
        intent = Intent(this, Zavershenie_poezdki::class.java)
        startActivity(intent)
    }
}