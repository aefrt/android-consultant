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
    private val adapter2 = DocAdapter2()
    private val adapter3 = DocAdapter3()
    private val adapter4 = DocAdapter4()
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
        adapter.addDoc(Doc(R.drawable.pattern, "Шаблон 1"))
        adapter.addDoc(Doc(R.drawable.pattern, "Шаблон 2"))
        adapter.addDoc(Doc(R.drawable.pattern, "Шаблон 3"))
        adapter.addDoc(Doc(R.drawable.pattern, "Шаблон 4"))

        adapter2.addDoc(Doc(R.drawable.pattern, "Административные правонарушения"))
        adapter2.addDoc(Doc(R.drawable.pattern, "ПДД для велосипедистов"))

        adapter3.addDoc(Doc(R.drawable.pattern, "Статья 1"))
        adapter3.addDoc(Doc(R.drawable.pattern, "Статья 2"))
        adapter3.addDoc(Doc(R.drawable.pattern, "Статья 3"))
        adapter3.addDoc(Doc(R.drawable.pattern, "Статья 4"))

        adapter4.addDoc(Doc(R.drawable.pattern, "Шаблон 1"))
        adapter4.addDoc(Doc(R.drawable.pattern, "Шаблон 2"))
        adapter4.addDoc(Doc(R.drawable.pattern, "Шаблон 3"))
        adapter4.addDoc(Doc(R.drawable.pattern, "Шаблон 4"))

        init()
        init2()
        init3()
        init4()


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
            /*buttonAdd.setOnClickListener {
                if (index > 4) index = 0
                val doc = Doc(imageIdList[index], "$index")
                adapter.addDoc(doc)
                index++
            }*/
        }
    }

    private fun init2() {
        binding.apply {
            rcView2.layoutManager = GridLayoutManager(context, 3)
            rcView2.adapter = adapter2
        }
    }
    private fun init3() {
        binding.apply {
            rcView3.layoutManager = GridLayoutManager(context, 3)
            rcView3.adapter = adapter3
        }
    }
    private fun init4() {
        binding.apply {
            rcView4.layoutManager = GridLayoutManager(context, 3)
            rcView4.adapter = adapter4
        }
    }

}