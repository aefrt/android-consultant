package com.example.myapplicationkotlinbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        intent = Intent(this, DisplayMessageActivity::class.java)
        startActivity(intent)
    }

    fun open_chat(view: View) {
        intent = Intent(this, ChatWindow::class.java)
        startActivity(intent)
    }

}