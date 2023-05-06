package com.example.handhoverpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AutoCompleteTextView
import androidx.recyclerview.widget.RecyclerView
import android.widget.ArrayAdapter as ArrayAdapter1

class EarningsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view=inflater.inflate(R.layout.fragment_earnings, container, false)


        val data1 = ArrayList<modalclass>()

        data1.add(modalclass("1"))
        data1.add(modalclass("2"))
        data1.add(modalclass("3"))
        data1.add(modalclass("4"))
        data1.add(modalclass("5"))
        data1.add(modalclass("6"))
        data1.add(modalclass("7"))
        data1.add(modalclass("8"))
        data1.add(modalclass("9"))
        data1.add(modalclass("10"))
        data1.add(modalclass("11"))
        data1.add(modalclass("12"))
        data1.add(modalclass("13"))
        data1.add(modalclass("14"))
        data1.add(modalclass("15"))
        data1.add(modalclass("16"))
        data1.add(modalclass("17"))
        data1.add(modalclass("18"))
        data1.add(modalclass("19"))
        data1.add(modalclass("20"))
        data1.add(modalclass("21"))
        data1.add(modalclass("22"))
        data1.add(modalclass("23"))
        data1.add(modalclass("24"))
        data1.add(modalclass("25"))
        data1.add(modalclass("26"))
        data1.add(modalclass("27"))
        data1.add(modalclass("28"))
        data1.add(modalclass("29"))
        data1.add(modalclass("30"))
        data1.add(modalclass("31"))





        val recyclerview1 = view.findViewById<RecyclerView>(R.id.reccycler_month)
        val adapter1=AdpterEarningMonth(data1)
        recyclerview1.adapter=adapter1

        val data = ArrayList<String>()

        for(item in 1..25){
            data.add("")
        }

        val recyclerview = view.findViewById<RecyclerView>(R.id.recycler_translist)
        val adapter=EarningAdpter(data)
        recyclerview.adapter=adapter





     // get reference to the string array that we just created
     val languages = resources.getStringArray(R.array.month)
     // create an array adapter and pass the required parameter
     // in our case pass the context, drop down layout , and array.
     val arrayAdapter = ArrayAdapter1(requireContext() , R.layout.drop_down, languages)
     // get reference to the autocomplete text view
     val autocompleteTV = view. findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
     // set adapter to the autocomplete tv to the arrayAdapter
     autocompleteTV.setAdapter(arrayAdapter)


     return view




    }
}


