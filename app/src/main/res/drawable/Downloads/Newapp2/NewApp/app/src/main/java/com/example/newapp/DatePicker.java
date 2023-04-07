package com.example.newapp;

import static com.example.newapp.R.id.date_picker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DatePicker extends AppCompatActivity {

    AppCompatButton nextBtn;
    EditText editDatePicker;
    android.widget.DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_picker_activity);

        datePicker = findViewById(date_picker);
        nextBtn = findViewById(R.id.next_btn);
        editDatePicker = findViewById(R.id.Edit_datepicker);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int day = datePicker.getDayOfMonth();
                 int month = (datePicker.getMonth() + 1);
                 int year = datePicker.getYear();
                 editDatePicker.setText("Date :"+ day + "/" + month + "/ " + year);

                Intent intent = new Intent(DatePicker.this,LayoutMain.class);
                startActivity(intent);

            }
        });

    }
}