package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VerifyOTP extends AppCompatActivity {

    AppCompatButton done_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verify_otp_activity);

        done_btn = findViewById(R.id.doneBtn);
        done_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(VerifyOTP.this,DatePicker.class);
                startActivity(intent);
            }
        });

    }
}