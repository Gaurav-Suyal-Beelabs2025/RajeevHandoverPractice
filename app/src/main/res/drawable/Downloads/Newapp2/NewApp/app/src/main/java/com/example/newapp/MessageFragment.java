package com.example.newapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MessageFragment extends Fragment {

    View view;
    RecyclerView recyclerView;

    int[] img = {R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,
            R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,
            R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,};



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.message_fragment, container, false);

        recyclerView = view.findViewById(R.id.messageRecyclerView);
        MessageAdapter messageAdapter = new MessageAdapter(img);
        recyclerView.setAdapter(messageAdapter);

        return view;
    }
}