package com.example.mainscreen.ui.notifications

import android.content.Intent
import android.graphics.Color
import com.example.mainscreen.R
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mainscreen.MainActivity


class Contract : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contract)
        val text = findViewById<TextView>(R.id.content)

        val spannable: Spannable = SpannableString(text.text)

        spannable.setSpan(
            ForegroundColorSpan(Color.BLUE),
            0,
            3,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        spannable.setSpan(
            ForegroundColorSpan(Color.BLUE),
            65,
            85,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        spannable.setSpan(
            ForegroundColorSpan(Color.BLUE),
            86,
            154,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        text.setText(spannable, TextView.BufferType.SPANNABLE)
    }

    fun goHome(view : View){
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}