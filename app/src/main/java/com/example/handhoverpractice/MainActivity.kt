package com.example.handhoverpractice


  import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.lang.Exception

  class MainActivity : AppCompatActivity() {

//    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navController = findNavController(R.id.activity_main_nav_host_fragment1)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_botton)
        bottomNavigationView.setupWithNavController(navController)

       navController.addOnDestinationChangedListener{_,destination,_ ->


           if (destination.id==R.id.PANVerificationFragment){
               bottomNavigationView.visibility=View.GONE
           }

           else if (destination.id==R.id.aadharVerificationFragment){
               bottomNavigationView.visibility=View.GONE
           }

           else if (destination.id==R.id.profileFragment){
               bottomNavigationView.visibility=View.GONE
           }

           else if (destination.id==R.id.rcVerificationFragment){
               bottomNavigationView.visibility=View.GONE
           }
           else if (destination.id==R.id.drivingLicenceVerificationFragment){
               bottomNavigationView.visibility=View.GONE
           }


           else if (destination.id==R.id.documentdetailsFragment){
               bottomNavigationView.visibility=View.GONE
           }

           else if (destination.id==R.id.applanguageFragment){
               bottomNavigationView.visibility=View.GONE
           }

           else if (destination.id==R.id.notificationlanguageFragment){
               bottomNavigationView.visibility=View.GONE
           }

           else if (destination.id==R.id.yourserviceFragment){
               bottomNavigationView.visibility=View.GONE
           }



           else{

               bottomNavigationView.visibility=View.VISIBLE
           }
       }


    }

}
