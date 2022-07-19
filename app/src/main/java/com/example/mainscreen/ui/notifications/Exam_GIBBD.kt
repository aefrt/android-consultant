package com.example.mainscreen.ui.notifications

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

}