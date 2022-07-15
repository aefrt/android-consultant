package com.example.mainscreen.ui.notifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.R

class IGetAFine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iget_afine)
    }
    fun navigate_postanovlenie(view: View) {
        Postanovlenie().show(supportFragmentManager, "Postanovlenie")
    }
}