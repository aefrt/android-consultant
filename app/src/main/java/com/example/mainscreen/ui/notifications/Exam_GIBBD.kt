package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.MainActivity
import com.example.mainscreen.R

class Exam_GIBBD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam_gibbd)
    }

    fun exam_hospital(view : View){
        intent = Intent(this, Exam_hospital::class.java)
        startActivity(intent)
    }

    fun carextrazakonseventwo(view : View){
        intent = Intent(this, Car_extra_zakon_seven_two::class.java)
        startActivity(intent)
    }

    fun goHome(view : View){
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}