package com.example.newapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class EmailFragment extends Fragment {
    View view;
    AppCompatButton emailSignInBtn;


    public EmailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.email_fragment, container, false);

        emailSignInBtn = view.findViewById(R.id.send_Email_OTP);
        emailSignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmailFragment.this.requireContext(),VerifyOTP.class);
                startActivity(intent);
            }
        });

        return view;
    }
}