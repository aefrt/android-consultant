package com.example.mainscreen.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mainscreen.R
import com.example.mainscreen.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    lateinit var v: View
    lateinit var recyclerView: RecyclerView
    lateinit var button: Button
    private val adapter = DocAdapter()
    private val imageIdList = listOf(
        R.drawable.pattern,
        R.drawable.pattern,
        R.drawable.pattern,
        R.drawable.pattern,
        R.drawable.pattern,
    )

    private var index = 0

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)

        v = inflater.inflate(R.layout.fragment_dashboard, container, false)
        recyclerView = v.findViewById(R.id.rcView)
        adapter.addDoc(Doc(R.drawable.pattern, "1"))
        adapter.addDoc(Doc(R.drawable.pattern, "1"))
        adapter.addDoc(Doc(R.drawable.pattern, "1"))
        adapter.addDoc(Doc(R.drawable.pattern, "1"))

        init()


        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun init() {
        binding.apply {
            rcView.layoutManager = GridLayoutManager(context, 3)
            rcView.adapter = adapter

        }
    }

}