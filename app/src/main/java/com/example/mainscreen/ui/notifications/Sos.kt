package com.example.mainscreen.ui.notifications

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mainscreen.R
import com.example.mainscreen.databinding.ActivityMainBinding


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

    fun ESS_call(view: View) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "+71234567899")
        startActivity(dialIntent)
    }

}