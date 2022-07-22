package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.MainActivity
import com.example.mainscreen.R

class Zavershenie_poezdki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zavershenie_poezdki)
    }

    fun bicyclezaversheniepoesdkipravilno(view : View) {
        intent = Intent(this, Zavershenie_poesdki_pravilno::class.java)
        startActivity(intent)
    }

    fun bicyclezaversheniepoesdkimoney(view : View) {
        intent = Intent(this, Zaveshenie_poezdki_money::class.java)
        startActivity(intent)
    }

    fun goHome(view : View){
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}