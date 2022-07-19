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

        // все должно работать, проблема в адаптере
        // см документацию https://firebaseopensource.com/projects/firebase/firebaseui-android/database/readme/
        // а что можно без setLayout???
        // думаю, стоит отказаться от этой облачной хуйни и настроить только аналитику и все — ведь это все-таки будет поиск в интерфейсе чата
        val options = FirebaseListOptions.Builder<String>().setQuery(FirebaseDatabase.getInstance().getReference().child("chat"), String::class.java).setLayout(android.R.layout.simple_list_item_1).build()
        val adapter = object : FirebaseListAdapter<String>(options) {
            override fun populateView(v: View, model: String, position: Int) {
                val mess_text : TextView = v.findViewById(android.R.id.text1)
                mess_text.setText(model)
            }
        }

        val listOfMessages = view.findViewById<ListView>(R.id.messages_list)
        listOfMessages.setAdapter(adapter)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[BlankViewModel::class.java]
        // TODO: Use the ViewModel
    }

    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // эта часть работает:

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