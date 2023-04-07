package com.example.handhoverpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation

class SplashscreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_splashscreen, container, false)


          val Gettingstart=view.findViewById<ConstraintLayout>(R.id.constraintLayout_buttongettingstart)

      Gettingstart.setOnClickListener {

             Navigation.findNavController(view).navigate(R.id.mobileverificationFragment)

      }





        return view
    }

}