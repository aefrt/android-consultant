package com.example.mainscreen.ui.notifications

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.R

class Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
    }

    fun link_bicycle(view : View){
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/15-pKN7gh6bpm-HGZMyVAD-UuA7M20sEPwzZ7_joh_lU/edit?usp=sharing"))
        startActivity(browserIntent)
    }
}