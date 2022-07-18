package com.example.mainscreen.ui.dashboard


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.os.StrictMode
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mainscreen.R
import java.io.File
import java.util.*
import javax.mail.*
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage


class Send_to_email : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_to_email)

        val button = findViewById<Button>(R.id.send)

        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View) {
                val username: String = "qwerty12applicat@gmail.com"
                val password: String = "Qwerty0890"
                val messageToSend = "Hello"
                val props: Properties = Properties()
                props.put("mail.smth.auth", "true")
                props.put("mail.smtp.starttls.enable", "true")
                props.put("mail.smtp.host", "smtp.gmail.com")
                props.put("mail.smtp.port", "888")
                //val session : Session = Session.getInstance(props, Authenticator()

                val session = Session.getInstance(props,
                    object : Authenticator() {
                        override fun getPasswordAuthentication(): PasswordAuthentication {
                            return PasswordAuthentication(username, password)
                        }
                    })
                try {
                    val message: Message = MimeMessage(session)
                    message.setFrom(InternetAddress(username))
                    message.setRecipients(
                        Message.RecipientType.TO,
                        InternetAddress.parse("qwerty12applicat@gmail.com")
                    )
                    message.setSubject("Sending")
                    message.setText("ajsfghasdhfgahfgay")
                    Transport.send(message)
                    Toast.makeText(this@Send_to_email, "email send", Toast.LENGTH_LONG).show()
                } catch (e: MessagingException) {
                    throw RuntimeException(e)
                }
            }

        })
        val policy : StrictMode.ThreadPolicy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        }


        /*val filename = "jurist.pdf"
        val filelocation = File(Environment.getExternalStorageDirectory(), filename)
        val sharingIntent = Intent(Intent.ACTION_SEND)
        sharingIntent.type = "vnd.android.cursor.dir/email"
        sharingIntent.type = "application/pdf"
        sharingIntent.putExtra(Intent.EXTRA_EMAIL, "mail@gmail.com")
        sharingIntent.putExtra(
            Intent.EXTRA_STREAM,
            Uri.parse("file://" + filelocation.absolutePath)
        )
        startActivity(Intent.createChooser(sharingIntent, "Send email"))*/

        /*val emailIntent = Intent(android.content.Intent.ACTION_SEND);
        emailIntent.setType("application/pdf");
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{strEmail});
        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Test Subject");
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "From My App");
        emailIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file:///mnt/sdcard/MyPdf.pdf"));
        startActivity(Intent.createChooser(emailIntent, "Send mail..."));*/
    }

    /*fun send_doc(){
        val test = findViewById<TextView>(R.id.txtTest)

        val button = findViewById<Button>(R.id.send)

        button.setOnClickListener {
            val filename = "jurist.pdf"
            val filelocation = File(Environment.getExternalStorageDirectory().absolutePath, filename)
            val path: Uri = Uri.fromFile(filelocation)

            test.setText(path.toString())

            val emailIntent = Intent(Intent.ACTION_SEND)

            emailIntent.type = "vnd.android.cursor.dir/email"
            emailIntent.type = "application/pdf"
            val to = arrayOf("dima.lapinin@yandex.ru")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, to)
            emailIntent.putExtra(Intent.EXTRA_STREAM, path)

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))*/


            /*val i = Intent(Intent.ACTION_SEND)
            i.type = "message/rfc822"
            i.putExtra(Intent.EXTRA_EMAIL, arrayOf("dima.lapinin@yandex.ru"))
            i.putExtra(Intent.EXTRA_SUBJECT, "subject of email")
            i.putExtra(Intent.EXTRA_TEXT, "body of email")
            try {
                startActivity(Intent.createChooser(i, "Send mail..."))
            } catch (ex: ActivityNotFoundException) {
                Toast.makeText(
                    this,
                    "There are no email clients installed.",
                    Toast.LENGTH_SHORT
                ).show()
            }*/