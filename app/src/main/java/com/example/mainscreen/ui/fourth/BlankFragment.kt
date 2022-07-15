package com.example.mainscreen.ui.fourth

import android.annotation.SuppressLint
import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.mainscreen.BlankViewModel
import com.example.mainscreen.Message
import com.example.mainscreen.R
import com.example.mainscreen.ui.notifications.PoliceIssues
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
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[BlankViewModel::class.java]
        // TODO: Use the ViewModel
    }

    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val SIGN_IN_CODE = 1
        val fragmentBlank = view.findViewById<ConstraintLayout>(R.layout.fragment_blank)
        val adapter : FirebaseListAdapter<Message>
        var buttonSend = view.findViewById<FloatingActionButton>(R.id.floatingActionButton)
        var editText = view.findViewById<TextInputEditText>(R.id.textInputEditText)
        var ref = FirebaseDatabase.getInstance().reference
        ref.keepSynced(true)

        buttonSend.setOnClickListener {
            var message = editText.text.toString().trim()
            if (message != "") {
                val mess = Message("vlad", message, 126)
                ref.child("chat").push().setValue(mess);
            }
            editText.setText("")
        }

        fun displayMessages() {
            val listOfMessages = view.findViewById<ListView>(R.id.messages_list)

            val options = FirebaseListOptions.Builder<Message>().setQuery(FirebaseDatabase.getInstance().reference, Message::class.java).setLayout(R.layout.messages_list_item,).build()
            val adapter = object : FirebaseListAdapter<Message>(options) {
                override fun populateView(v: View, model: Message, position: Int) {
                    val mess_user : TextView = v.findViewById(R.id.message_user)
                    var mess_time : TextView = v.findViewById(R.id.message_time)
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
            Snackbar.make(fragmentBlank, "Вы авторизованы", Snackbar.LENGTH_LONG).show()
            displayMessages()
        }
    }

}