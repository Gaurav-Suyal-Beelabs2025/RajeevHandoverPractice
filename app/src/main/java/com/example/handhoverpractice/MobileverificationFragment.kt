package com.example.handhoverpractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class MobileverificationFragment : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_mobileverification, container, false)


        val Verify=view.findViewById<Button>(R.id.appbutton_verify)


        Verify.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.home_fragement)

        }



        return view
    }

}