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
        // trying to display messages; реализую с самого начала, с 8:47
        // onActivityResult, 15:00 пропущу, не понял, зачем это итд => не буду реализовывать
        // onCreate??
        val SIGN_IN_CODE = 1
        val fragmentBlank = view.findViewById<ConstraintLayout>(R.layout.fragment_blank)
        val adapter : FirebaseListAdapter<Message>
        var buttonSend = view.findViewById<FloatingActionButton>(R.id.floatingActionButton)
        var editText = view.findViewById<TextInputEditText>(R.id.textInputEditText)
        var ref = FirebaseDatabase.getInstance().reference
        ref.keepSynced(true)

        // здесь все отлично работает
        buttonSend.setOnClickListener {
            var message = editText.text.toString().trim()
            if (message != "") {
                val mess = Message("vlad", message, 126)
                // логично иметь два пользователя: user и support?? или как это реализовать лучше? см тот гайд
                ref.child("chat").push().setValue(mess);
            }
            editText.setText("")
        }

        // это точно что-то нужное? или для этого еще и onActivityResult нужен, см верх?
        if (FirebaseAuth.getInstance().currentUser == null) {
            startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().build(), SIGN_IN_CODE)
        } else {
            Snackbar.make(fragmentBlank, "Вы авторизованы", Snackbar.LENGTH_LONG).show()
        }

        // пока не дописал, разберусь с конструктором, допишу и норм запущу!
        fun displayAllMessages() {
            val listOfMessages = view.findViewById<ListView>(R.id.messages_list)

            val options = FirebaseListOptions.Builder<Message>().setQuery(FirebaseDatabase.getInstance().reference, Message::class.java).setLayout(R.layout.messages_list_item,).build()
            val adapter = object : FirebaseListAdapter<Message>(options) {
                override fun populateView(v: View, model: Message, position: Int) {
                    val mess_user : TextView
                    var mess_time : TextView
                    val mess_text : TextView
                    mess_user = v.findViewById(R.id.message_user)
                    mess_time = v.findViewById(R.id.message_time)
                    mess_text = v.findViewById(R.id.message_text)

                    mess_user.setText(model.userName)
                    mess_text.setText(model.textMessage)
                    mess_time.setText("0")
                    // у меня нет time mess_time.setText(model.)
                }
            }
            listOfMessages.setAdapter(adapter)
        }
    }

}