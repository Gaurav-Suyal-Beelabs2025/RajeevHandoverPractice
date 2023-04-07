package com.example.handhoverpractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import com.example.handhoverpractice.R.id.img_profile
import com.google.android.gms.maps.MapView

class HomeFragment : Fragment() {

     @SuppressLint("MissingInflatedId")
     override fun onCreateView(
         inflater: LayoutInflater, container: ViewGroup?,
         savedInstanceState: Bundle?
     ): View? {
         // Inflate the layout for this fragment
          val view=inflater.inflate(R.layout.fragment_home, container, false)


           val Profile=view.findViewById<ImageView>(img_profile)

            Profile.setOnClickListener {

                Navigation.findNavController(view).navigate(R.id.profileFragment)

            }



           return view;
     }
 }