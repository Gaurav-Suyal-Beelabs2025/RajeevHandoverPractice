package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpPage extends AppCompatActivity {

    AppCompatButton signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_page_activity);

        signUp = findViewById(R.id.sign_up_Btn);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpPage.this,OtpSignUp.class);
                startActivity(intent);
            }
        });
    }
}