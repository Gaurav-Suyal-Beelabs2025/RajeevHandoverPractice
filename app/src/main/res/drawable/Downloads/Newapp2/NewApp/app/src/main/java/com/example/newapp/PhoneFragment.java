package com.example.newapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PhoneFragment extends Fragment {

    View view;
    AppCompatButton phoneSignInBtn;


    public PhoneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_phone, container, false);
        phoneSignInBtn = view.findViewById(R.id.send_otpBtn);
        phoneSignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhoneFragment.this.requireContext(),VerifyOTP.class);
                startActivity(intent);
            }
        });
        return view;
    }
}