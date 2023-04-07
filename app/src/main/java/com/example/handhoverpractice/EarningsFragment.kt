package com.example.handhoverpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EarningsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view=inflater.inflate(R.layout.fragment_earnings, container, false)



        val data = ArrayList<String>()

        for(item in 1..25){
            data.add("")
        }


        val recyclerview = view.findViewById<RecyclerView>(R.id.recycler_translist)
        val adapter=EarningAdpter(data)
        recyclerview.adapter=adapter



        return view



    }


}