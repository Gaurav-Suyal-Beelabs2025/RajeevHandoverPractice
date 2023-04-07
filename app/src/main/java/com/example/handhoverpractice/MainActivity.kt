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

           else if (destination.id==R.id.documentdetailsFragment){
               bottomNavigationView.visibility=View.GONE
           }

           else{

               bottomNavigationView.visibility=View.VISIBLE
           }
       }


    }

}

//        loadFragment(HomeFragment())
//        bottomNav = findViewById(R.id.nav_botton) as BottomNavigationView
//        bottomNav.setOnItemSelectedListener {
//            when  (it.itemId) {
//                R.id.ic_home -> {
//                    loadFragment(HomeFragment())
//                    true
//                }
//                R.id.ic_Earnings -> {
//                    loadFragment(EarningsFragment())
//                    true
//                }
//                R.id.ic_Payout -> {
//                    loadFragment(PayoutFragment())
//                    true
//                }
//                R.id.ic_Support -> {
//                    loadFragment(SupportFragment())
//                    true
//                }
//
//                else -> {
//                    false
//                }
//            }
//        }
//    }
//    private  fun loadFragment(fragment: Fragment){
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.container,fragment)
//        transaction.commit()
//    }
//
//}