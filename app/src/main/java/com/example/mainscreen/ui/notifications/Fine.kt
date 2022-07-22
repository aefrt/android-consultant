package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.MainActivity
import com.example.mainscreen.R

class Fine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fine)
    }

    fun inspector_fine(view : View){
        intent = Intent(this, Inspector_fine::class.java)
        startActivity(intent)
    }

    fun why_no_inspector_fine(view : View){
        intent = Intent(this, Why_no_inspector_fine::class.java)
        startActivity(intent)
    }

    fun post(view : View){
        intent = Intent(this, Post::class.java)
        startActivity(intent)
    }

    fun hyper8_1(view : View){
        intent = Intent(this, Hyper8_1::class.java)
        startActivity(intent)
    }

    fun hyper8_2(view : View){
        intent = Intent(this, Hyper8_2::class.java)
        startActivity(intent)
    }

    fun protocol(view : View){
        intent = Intent(this, Protocol::class.java)
        startActivity(intent)
    }

    fun goHome(view : View){
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}