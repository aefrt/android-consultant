package com.example.mainscreen.ui.fourth

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mainscreen.BlankViewModel
import com.example.mainscreen.Message
import com.example.mainscreen.R
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.database.FirebaseListAdapter
import com.firebase.ui.database.FirebaseListOptions
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase


class BlankFragment : Fragment() {
    companion object {
        fun newInstance() = BlankFragment()
    }

    private lateinit var viewModel: BlankViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)

        val listOfMessages = view.findViewById<ListView>(R.id.messages_list)
        val values = arrayOf("Здравствуйте! Меня остановил сотрудник ГИБДД, 07:31, требует дать взятку, что делать?")
        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(view.context, android.R.layout.simple_list_item_1, values)
        listOfMessages.setAdapter(adapter)

        /*
        https://code.tutsplus.com/ru/tutorials/how-to-create-an-android-chat-app-using-firebase--cms-27397
        Все должно работать
        // val fragmentBlank = view.findViewById<ConstraintLayout>(R.layout.fragment_blank)
        val SIGN_IN_CODE = 1
        val adapter : FirebaseListAdapter<Message>

        fun displayMessages() {
            val listOfMessages = view.findViewById<ListView>(R.id.messages_list)
            val options = FirebaseListOptions.Builder<Message>().setQuery(FirebaseDatabase.getInstance().getReference().child("chat"), Message::class.java).setLayout(R.layout.messages_list_item).build()
            val adapter = object : FirebaseListAdapter<Message>(options) {
                override fun populateView(v: View, model: Message, position: Int) {
                    val mess_user : TextView = v.findViewById(R.id.message_user)
                    val mess_time : TextView = v.findViewById(R.id.message_time)
                    val mess_text : TextView = v.findViewById(R.id.message_text)

                    mess_user.setText(model.userName)
                    mess_text.setText(model.textMessage)
                    mess_time.setText("0")
                }
            }
            listOfMessages.setAdapter(adapter)
        }

        if (FirebaseAuth.getInstance().currentUser == null) {
            startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().build(), SIGN_IN_CODE)
        } else {
            // Snackbar.make(fragmentBlank, "Вы авторизованы", Snackbar.LENGTH_LONG).show()
            displayMessages()
        }
        */

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[BlankViewModel::class.java]
        // TODO: Use the ViewModel
    }

    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val buttonSend = view.findViewById<FloatingActionButton>(R.id.floatingActionButton)
        val editText = view.findViewById<TextInputEditText>(R.id.textInputEditText)
        val ref = FirebaseDatabase.getInstance().reference
        ref.keepSynced(true)

        buttonSend.setOnClickListener {
            val message = editText.text.toString().trim()
            if (message != "") {
                val mess = Message("vlad", message, 126)
                ref.child("chat").push().setValue(mess);
            }
            editText.setText("")
        }
    }

}