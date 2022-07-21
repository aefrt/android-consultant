package com.example.mainscreen.ui.notifications

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mainscreen.R

class Sos_Instruct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sos_instruct)

        val arguments = intent.extras
        val name = arguments!!["head"].toString()

        val title = findViewById<TextView>(R.id.sos_title)
        val text1 = findViewById<TextView>(R.id.sos_text1)
        val text2 = findViewById<TextView>(R.id.sos_text2)
        val numb = findViewById<TextView>(R.id.number)
        val button = findViewById<Button>(R.id.button_call)


        title.setText(name)


        when(name){
            "Единая служба спасения" -> {
                text1.setText("Предназначена для обеспечения оказания экстренной помощи населению при угрозах для жизни и здоровья, для уменьшения материального ущерба при несчастных случаях, авариях, пожарах, нарушениях общественного порядка и при других происшествиях и чрезвычайных ситуациях, а также для информационного обеспечения единых дежурно-диспетчерских служб (ЕДДС) муниципальных образований.")
                text2.setText("1) точный адрес места происшествия и/или примерные ориентиры\n\n" +
                        "2) схему проезда к месту происшествия\n\n" +
                        "3) номер телефона, с которого вы звоните\n\n" +
                        "4) ваше имя\n\n" +
                        "5) подробную информацию о происшествии")
                numb.setText("112")
            }
            "Скорая помощь" -> {
                text1.setText("Согласно приказу Министерства здравоохранения Российской Федерации скорая, в том числе скорая специализированная, медицинская помощь оказывается при заболеваниях, несчастных случаях, травмах, отравлениях и других состояниях, требующих срочного медицинского вмешательства.")
                text2.setText("1)  коротко: что случилось\n\n" +
                         "2)  номер телефона, с которого звоните\n\n" +
                         "3) адрес, где находится больной (если помощь нужна человеку на улице, укажите четкие ориентиры; если вызов в квартиру — укажите место ближайшего заезда к дому, номер подъезда, этажа, кодового замка)\n" +
                        "4) фамилию, имя, отчество пострадавшего (если известно)\n\n" +
                        "5) дату рождения (если известно) или возраст пациента\n\n" +
                        "6) ваше имя")
                numb.setText("103")
            }
            "Горячая линия ГИББД" -> {
                text1.setText("Сфера компетенции службы охватывает не только проблемы, которые касаются оплаты штрафов и неправомерных действий сотрудников дорожной полиции Госавтоинспекции, но и многие другие вопросы. Обратиться за бесплатной помощью по телефону горячей линии ГИБДД может любой автомобилист и даже пешеход независимо от времени суток.")
                text2.setText("1)  четко изложить суть проблемы\n\n" +
                        "2)   номер телефона, с которого звоните")
                numb.setText("102")
            }
            else -> {
                setContentView(R.layout.activity_all_regions)
                val button_all1 = findViewById<Button>(R.id.all_regions_call1)
                val button_all2 = findViewById<Button>(R.id.all_regions_call2)
                val button_all3 = findViewById<Button>(R.id.all_regions_call3)
                val button_all4 = findViewById<Button>(R.id.all_regions_call4)
                val button_all5 = findViewById<Button>(R.id.all_regions_call5)
                button_all1.setOnClickListener {
                    val dialIntent = Intent(Intent.ACTION_DIAL)
                    dialIntent.data = Uri.parse("tel:" + findViewById<TextView>(R.id.all_regions_number1).text)
                    startActivity(dialIntent)
                }
                button_all2.setOnClickListener {
                    val dialIntent = Intent(Intent.ACTION_DIAL)
                    dialIntent.data = Uri.parse("tel:" + findViewById<TextView>(R.id.all_regions_number2).text)
                    startActivity(dialIntent)
                }
                button_all3.setOnClickListener {
                    val dialIntent = Intent(Intent.ACTION_DIAL)
                    dialIntent.data = Uri.parse("tel:" + findViewById<TextView>(R.id.all_regions_number3).text)
                    startActivity(dialIntent)
                }
                button_all4.setOnClickListener {
                    val dialIntent = Intent(Intent.ACTION_DIAL)
                    dialIntent.data = Uri.parse("tel:" + findViewById<TextView>(R.id.all_regions_number4).text)
                    startActivity(dialIntent)
                }
                button_all5.setOnClickListener {
                    val dialIntent = Intent(Intent.ACTION_DIAL)
                    dialIntent.data = Uri.parse("tel:" + findViewById<TextView>(R.id.all_regions_number5).text)
                    startActivity(dialIntent)
                }
            }

        }
        button.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + numb.text)
            startActivity(dialIntent)
        }


    }

}