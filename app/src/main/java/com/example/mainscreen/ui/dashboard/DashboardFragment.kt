package com.example.mainscreen.ui.dashboard

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mainscreen.R
import com.example.mainscreen.databinding.FragmentDashboardBinding


class DashboardFragment : Fragment(){

    private var _binding: FragmentDashboardBinding? = null

    lateinit var v: View
    lateinit var recyclerView: RecyclerView
    private val adapter = DocAdapter()
    private val adapter2 = DocAdapter2()
    private val adapter3 = DocAdapter3()
    private val adapter4 = DocAdapter4()





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
        adapter2.addDoc(Doc(R.drawable.pattern, "Рубрикатор основных правовых понятий"))

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
            //rcView.layoutManager = GridLayoutManager(context, 3)
            rcView.layoutManager = LinearLayoutManager(context)
            rcView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL ,false)
            rcView.adapter = adapter
        }
    }

    private fun init2() {
        binding.apply {
            //rcView2.layoutManager = GridLayoutManager(context, 3)
            rcView2.layoutManager = LinearLayoutManager(context)
            rcView2.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL ,false)
            rcView2.adapter = adapter2
        }
    }

    private fun init3() {
        binding.apply {
            //rcView3.layoutManager = GridLayoutManager(context, 3)
            rcView3.layoutManager = LinearLayoutManager(context)
            rcView3.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL ,false)
            rcView3.adapter = adapter3
        }
    }

    private fun init4() {
        binding.apply {
            //rcView4.layoutManager = GridLayoutManager(context, 3)
            rcView4.layoutManager = LinearLayoutManager(context)
            rcView4.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL ,false)
            rcView4.adapter = adapter4
        }
    }





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        adapter.attachDelegate(object : DocDelegate {
            override fun openDoc(head: String) {
                navigate(head)
            }
        })
        adapter2.attachDelegate(object : DocDelegate2 {
            override fun openDoc(head: String) {
                navigate2(head)
            }
        })
        adapter3.attachDelegate(object : DocDelegate3 {
            override fun openDoc(head: String) {
                navigate(head)
            }
        })
        adapter4.attachDelegate(object : DocDelegate4 {
            override fun openDoc(head: String) {
                navigate(head)
            }
        })

    }

    fun navigate(head : String) {
        val intent = Intent(context, DashboardNewPage::class.java)
        intent.putExtra("heading", head)
        startActivity(intent)
    }

    fun navigate2(head : String) {
        val intent = Intent(context, Spravochnaya::class.java)
        intent.putExtra("heading", head)
        startActivity(intent)
    }


}