package com.example.mainscreen.ui.notifications

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mainscreen.MainActivity
import com.example.mainscreen.R
import com.example.mainscreen.databinding.ActivityMainBinding



class Sos : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sos)

        val button1 = findViewById<TextView>(R.id.instr1)
        val button2 = findViewById<TextView>(R.id.instr2)
        val button3 = findViewById<TextView>(R.id.instr3)
        val button4 = findViewById<TextView>(R.id.instr4)

        button1.setOnClickListener {
            intent = Intent(this, Sos_Instruct::class.java)
            val text = findViewById<TextView>(R.id.num_title1)
            intent.putExtra("head", text.text.toString())
            startActivity(intent)
        }
        button2.setOnClickListener {
            intent = Intent(this, Sos_Instruct::class.java)
            val text = findViewById<TextView>(R.id.num_title2)
            intent.putExtra("head", text.text.toString())
            startActivity(intent)
        }
        button3.setOnClickListener {
            intent = Intent(this, Sos_Instruct::class.java)
            val text = findViewById<TextView>(R.id.num_title3)
            intent.putExtra("head", text.text.toString())
            startActivity(intent)
        }
        button4.setOnClickListener {
            intent = Intent(this, Sos_Instruct::class.java)
            val text = findViewById<TextView>(R.id.num_title4)
            intent.putExtra("head", text.text.toString())
            startActivity(intent)
        }

        /* adapter.addNumber(Number( "Шаблон 1"))
         adapter.addNumber(Number( "Шаблон 1"))
         adapter.addNumber(Number( "Шаблон 1"))
         adapter.addNumber(Number( "Шаблон 1"))

         val rcView = findViewById<RecyclerView>(R.id.numb_rcView)

         rcView.layoutManager = LinearLayoutManager(this@Sos)
         rcView.adapter = adapter*/
    }

    /*fun instr(view : View) {
        intent = Intent(this, Sos_Instruct::class.java)
        when
        val text = findViewById<TextView>(R.id.num_title1)
        intent.putExtra("head", text.text.toString())
        startActivity(intent)

        // findViewById<TextView>(R.id.sos_title).toString()
    }*/


    fun ESS_call1(view: View) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "112")
        startActivity(dialIntent)
    }

    fun ESS_call2(view: View) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "102")
        startActivity(dialIntent)
    }

    fun ESS_call3(view: View) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "103")
        startActivity(dialIntent)
    }

    fun ESS_call4(view: View) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "102")
        startActivity(dialIntent)
    }

    fun goHome(view : View){
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}