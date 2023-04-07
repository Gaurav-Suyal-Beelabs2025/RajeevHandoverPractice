package com.example.handhoverpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation

class LanguagesettingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_languagesetting, container, false)


          val Applanguage=view.findViewById<ConstraintLayout>(R.id.constraintLayout_applanguage)
          val Notificationlanguage=view.findViewById<ConstraintLayout>(R.id.constraintLayout_notificationlanuage)

        Applanguage.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.applanguageFragment)

        }

        Notificationlanguage.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.notificationlanguageFragment)

        }



        return view
    }


}