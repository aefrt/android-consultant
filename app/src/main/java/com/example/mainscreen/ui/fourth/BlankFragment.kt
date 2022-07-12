package com.example.mainscreen.ui.fourth

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.example.mainscreen.BlankViewModel
import com.example.mainscreen.R
import com.firebase.ui.auth.AuthUI
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth

class BlankFragment : Fragment() {

    private var SIGN_IN_CODE = 1;
    private lateinit var activity_main : RelativeLayout; // ???

    companion object {
        fun newInstance() = BlankFragment()
    }

    private lateinit var viewModel: BlankViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // YouTube
        // da blin: activity_main = findViewById() 9:50

        if (FirebaseAuth.getInstance().currentUser == null) {
            startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().build(),
                SIGN_IN_CODE);
            print("b kkkk")
        } else {
            print("a kkkk") // а куда он принт сделает?
            // Snackbar.make().show() // ???
        }

        // Been
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BlankViewModel::class.java)
        // TODO: Use the ViewModel
    }

    // support.zip: нужно прорисовать отдельно без надписи форму ввода, кнопку отправить и облачко тоже без надписи, а плка буду юзать стандартные.
    // чтобы понять куда прописывать функции почитать про жизненный цикл Fragment
    // lect2456 for backend

}