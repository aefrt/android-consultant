package com.example.mainscreen.ui.notifications

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.StyleSpan
import android.view.View
import android.widget.TextView
import com.example.mainscreen.R

class PoliceIssues : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_police_issues)

        // 1
        val osmotr_ss = SpannableString("1. Осмотр — это визуальное обследование со стороны, его основаниями могут быть информация об использовании транспортного средства в противоправных целях, необходимость проверки номеров, перевозимого груза. По окончании составляется акт осмотра.")
        val clickableSpanOsmotr: ClickableSpan = object : ClickableSpan() {

            override fun onClick(textView: View) {

                startActivity(Intent(this@PoliceIssues, VzyatkaVymog::class.java))
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.setColor(Color.MAGENTA)
                ds.isUnderlineText = false
            }
        }
        osmotr_ss.setSpan(clickableSpanOsmotr, 3, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        val boldSpanOsmotr = StyleSpan(Typeface.BOLD)
        osmotr_ss.setSpan(boldSpanOsmotr, 3, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)


        val osmotr = findViewById<TextView>(R.id.textView32)
        osmotr.text = osmotr_ss
        osmotr.movementMethod = LinkMovementMethod.getInstance()
        osmotr.highlightColor = Color.TRANSPARENT

        // 2
        val vskrytie_ss = SpannableString("2. Вскрытие проводится, если есть подозрения, что в транспортном средстве находятся без специального разрешения предметы или вещи, изъятые из оборота или ограниченные в обороте.")
        val clickableSpanVskrytie: ClickableSpan = object : ClickableSpan() {

            override fun onClick(textView: View) {

                startActivity(Intent(this@PoliceIssues, VzyatkaVymog::class.java))
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.setColor(Color.MAGENTA)
                ds.isUnderlineText = false
            }
        }
        vskrytie_ss.setSpan(clickableSpanVskrytie, 3, 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        val boldSpanVskrytie = StyleSpan(Typeface.BOLD)
        vskrytie_ss.setSpan(boldSpanVskrytie, 3, 11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)


        val vskrytie = findViewById<TextView>(R.id.textView60)
        vskrytie.text = vskrytie_ss
        vskrytie.movementMethod = LinkMovementMethod.getInstance()
        vskrytie.highlightColor = Color.TRANSPARENT

        // 3
        val dosmotr_ss = SpannableString("3. Досмотр — обследование, проводимое без нарушения конструктивной целостности автомобиля для обнаружения орудий совершения либо предметов административного правонарушения. Это более серьезная процедура, требующая привлечения 2 понятых, либо применение видеозаписи. По окончании составляется протокол досмотра, либо вносится запись в протокол об административном правонарушении. Помните, что инспектор не может сам открывать двери и двигать предметы в транспортном средстве при досмотре.")
        val clickableSpanDosmotr: ClickableSpan = object : ClickableSpan() {

            override fun onClick(textView: View) {

                startActivity(Intent(this@PoliceIssues, VzyatkaVymog::class.java))
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.setColor(Color.MAGENTA)
                ds.isUnderlineText = false
            }
        }
        dosmotr_ss.setSpan(clickableSpanDosmotr, 3, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        val boldSpanDosmotr = StyleSpan(Typeface.BOLD)
        dosmotr_ss.setSpan(boldSpanDosmotr, 3, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)


        val dosmotr = findViewById<TextView>(R.id.textView59)
        dosmotr.text = dosmotr_ss
        dosmotr.movementMethod = LinkMovementMethod.getInstance()
        dosmotr.highlightColor = Color.TRANSPARENT
    }

    fun poliss(view: View){
        intent = Intent(this, Police_issues2::class.java)
        startActivity (intent)
    }

    fun nobertwomoshennik(view: View){
        intent = Intent(this, NombertwoMoshennik::class.java)
        startActivity (intent)
    }

    fun no_docs(view: View) {
        IHaveNotDocs().show(supportFragmentManager, "IHaveNotDocs")
    }


    fun navigate_to_fine(view: View){
        intent = Intent(this, IGetAFine::class.java)
        startActivity(intent)
    }

    // Экран 5

    fun vzyatkaVymog(view: View) {
        intent = Intent(this, VzyatkaVymog::class.java)
        startActivity(intent)
    }

    fun vzyatkaDat(view: View) {
        intent = Intent(this, VzyatkaDat::class.java)
        startActivity(intent)
    }
}