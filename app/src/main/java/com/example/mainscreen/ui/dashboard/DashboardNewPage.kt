package com.example.mainscreen.ui.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.mainscreen.R

class DashboardNewPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_new_page)
    }

    fun navigate_to_mail(view : View){
        val intent = Intent(this , Send_to_email::class.java)
        startActivity(intent)
    }
}

