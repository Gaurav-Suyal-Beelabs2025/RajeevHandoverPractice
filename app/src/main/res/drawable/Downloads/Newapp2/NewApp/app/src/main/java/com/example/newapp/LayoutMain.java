package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LayoutMain extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main_activity);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        replaceFragment(new SurroundFragment());

        bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.surround_sound_icon:
                    replaceFragment(new SurroundFragment());
                    break;
                case R.id.video_icon:
                    replaceFragment(new VideoFragment());
                    break;
                case R.id.matches_icon:
                    replaceFragment(new MatchFragment());
                    break;
                case R.id.message_icon:
                    replaceFragment(new MessageFragment());
                    break;
                case R.id.person_icon:
                    replaceFragment(new ProfileFragment());
                    break;
            }
            return true;
        });

    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }
}