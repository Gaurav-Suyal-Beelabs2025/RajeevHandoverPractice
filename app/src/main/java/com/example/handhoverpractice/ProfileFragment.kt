package com.example.handhoverpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation

class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         val view= inflater.inflate(R.layout.fragment_profile, container, false)

         val Handoveridcard=view.findViewById<ConstraintLayout>(R.id.constraintLayout_hndovrid)
         val Documentdetails=view.findViewById<ConstraintLayout>(R.id.constraintLayout_documents)
         val Myperformance=view.findViewById<ConstraintLayout>(R.id.constraintLayout_myperformance)
         val Yourservice=view.findViewById<ConstraintLayout>(R.id.constraintLayout_yourservice)
         val Languagesetting=view.findViewById<ConstraintLayout>(R.id.constraintLayout_language)
         val Vehicledetails=view.findViewById<ConstraintLayout>(R.id.constraintLayout_Vehicle)
         val WorkinMode=view.findViewById<ConstraintLayout>(R.id.constraintLayout_Working_mode)


         Handoveridcard.setOnClickListener {

             Navigation.findNavController(view).navigate(R.id.profileidcardFragment)

         }

        Documentdetails.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.documentdetailsFragment)

        }

        Myperformance.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.myperformanceFragment)

        }


        Yourservice.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.yourserviceFragment)



        }


        Languagesetting.setOnClickListener {


            Navigation.findNavController(view).navigate(R.id.languagesettingFragment)

        }

        Vehicledetails.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.vehicleDetailsFragment)

        }

        WorkinMode.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.workig_modeFragment)

        }


        return view

    }

}