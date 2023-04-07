package com.example.handhoverpractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation


class DocumentdetailsFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
          val view=inflater.inflate(R.layout.fragment_documentdetails, container, false)

          val Rcverification=view.findViewById<ConstraintLayout>(R.id.view_rc)

          val Drivinglicence=view.findViewById<ConstraintLayout>(R.id.view_dl)

          val Adhar=view.findViewById<ConstraintLayout>(R.id.view_adhar)


          val pancard=view.findViewById<ConstraintLayout>(R.id.view_pan)

         Rcverification.setOnClickListener {

             Navigation.findNavController(view).navigate(R.id.rcVerificationFragment)

         }

        Drivinglicence.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.drivingLicenceVerificationFragment)

        }

        Adhar.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.aadharVerificationFragment)

        }

        pancard.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.action_documentdetailsFragment_to_PANVerificationFragment)

        }


        return view

    }


}