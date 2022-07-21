package com.example.mainscreen.ui.dashboard

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mainscreen.R


class Spravochnaya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spravochnaya)
    }

    fun link(view : View){
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/document/d/1cp5pp1Bde6LwSY5TtVu6XOwrjH4ClUg0aeGOu24dBg4/edit"))
        startActivity(browserIntent)
    }
}