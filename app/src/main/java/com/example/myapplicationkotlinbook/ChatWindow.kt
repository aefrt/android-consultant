package com.example.myapplicationkotlinbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChatWindow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_window)
    }
}