package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.MainActivity
import com.example.mainscreen.R

class ExtraBycicle5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra_bycicle5)
    }

    fun goHome(view : View){
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}