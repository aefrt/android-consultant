package com.example.mainscreen.ui.fourth

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import com.example.mainscreen.BlankViewModel
import com.example.mainscreen.Message
import com.example.mainscreen.R
import com.example.mainscreen.ui.notifications.PoliceIssues
import com.firebase.ui.auth.AuthUI
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

    // trying io connect to db
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var buttonSend = view.findViewById<FloatingActionButton>(R.id.floatingActionButton)
        var editText = view.findViewById<TextInputEditText>(R.id.textInputEditText)
        var ref = FirebaseDatabase.getInstance().getReference()
        ref.keepSynced(true)

        buttonSend.setOnClickListener {
            var message = editText.text.toString().trim()
            if (message != "") {
                val mess = Message("vlad", message, 126)
                ref.child("chat").push().setValue(mess);
            }
            editText.setText("")
        }

        if (FirebaseAuth.getInstance().currentUser == null) {
            // ?? https://www.youtube.com/watch?v=gFtajvZajrg&list=PL0lO_mIqDDFUXOmQ5c6hurb2Nqvc1uCxe&index=4 27:00
            startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().build(),  1)
        } else {
            // hm
        }
    }

}