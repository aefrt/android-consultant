package com.example.myapplicationkotlinbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
    }
    fun sendMessage2(view: View) {
        val editText2 = findViewById<Button>(R.id.button2)
        val message2 = editText2.text.toString()
        val intent2 = Intent(this, DisplayInstruction1::class.java).apply {
            putExtra("aaa", message2)
        }
        startActivity(intent2)
    }
}