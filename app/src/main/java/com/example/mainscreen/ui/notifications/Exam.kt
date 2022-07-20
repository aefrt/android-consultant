package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mainscreen.R

class Exam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam)
    }
    fun exam_gibbd(view : View) {
        intent = Intent(this, Exam_GIBBD::class.java)
        startActivity(intent)
    }

    fun exam_hospital(view : View){
        intent = Intent(this, Exam_hospital::class.java)
        startActivity(intent)
    }

    fun carextrazakonseven(view : View) {
        intent = Intent(this, Car_extra_zakon_seven::class.java)
        startActivity(intent)
    }
}