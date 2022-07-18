package com.example.mainscreen.ui.notifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mainscreen.R
import com.example.mainscreen.databinding.ActivityMainBinding
import com.example.mainscreen.ui.dashboard.Doc

class Sos : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sos)

       /* adapter.addNumber(Number( "Шаблон 1"))
        adapter.addNumber(Number( "Шаблон 1"))
        adapter.addNumber(Number( "Шаблон 1"))
        adapter.addNumber(Number( "Шаблон 1"))

        val rcView = findViewById<RecyclerView>(R.id.numb_rcView)

        rcView.layoutManager = LinearLayoutManager(this@Sos)
        rcView.adapter = adapter*/



    }

}