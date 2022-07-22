package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mainscreen.R
import com.example.mainscreen.ui.dashboard.DashboardNewPage
import com.example.mainscreen.ui.dashboard.Doc
import com.example.mainscreen.ui.dashboard.DocAdapter
import com.example.mainscreen.ui.dashboard.DocDelegate

class Extra_bicycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extra_bicycle)

        /* bycicle with rcview
        val recyclerView = findViewById<RecyclerView>(R.id.rcView_ending)
        val adapter = DocAdapter()
        adapter.addDoc(Doc(R.drawable.pattern, "Велосипед сломался, что делать?"))
        adapter.addDoc(Doc(R.drawable.pattern, "Велосипед украли во время поездки, что делать?"))
        adapter.addDoc(Doc(R.drawable.pattern, "Я попал в ДТП на арендованном велосипеде, что делать?"))
        adapter.addDoc(Doc(R.drawable.pattern, "Я нарушил ПДД на арендованном велосипеде, что делать?"))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL ,false)
        recyclerView.adapter = adapter

        // делаем кнопки

        fun navigate(head : String) {
            val intent = Intent(this, DashboardNewPage::class.java)
            intent.putExtra("heading", head)
            startActivity(intent)
        }

        adapter.attachDelegate(object : DocDelegate {
            override fun openDoc(head: String) {
                navigate(head)
            }
        })*/
    }



    fun pay(view: View) {
        intent = Intent(this, Payment::class.java)
        startActivity(intent)
    }

    fun before(view: View) {
        intent = Intent(this, Before_trip::class.java)
        startActivity(intent)
    }

    fun trip(view: View) {
        intent = Intent(this, Vo_vremy_poezdki::class.java)
        startActivity(intent)
    }

    fun extra5(view : View){
        intent = Intent(this, ExtraBycicle5::class.java)
        startActivity(intent)
    }

    fun extra6(view : View){
        intent = Intent(this, ExtraBycicle6::class.java)
        startActivity(intent)
    }

    fun extra7(view : View){
        intent = Intent(this, ExtraBycicle7::class.java)
        startActivity(intent)
    }

    fun extra8(view : View){
        intent = Intent(this, ExtraBycicle8::class.java)
        startActivity(intent)
    }

    fun bicyclezaversheniepoesdki(view : View) {
        intent = Intent(this, Zavershenie_poezdki::class.java)
        startActivity(intent)
    }
}