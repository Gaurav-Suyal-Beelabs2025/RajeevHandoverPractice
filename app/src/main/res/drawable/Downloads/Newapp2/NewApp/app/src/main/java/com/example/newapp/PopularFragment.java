package com.example.newapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class PopularFragment extends Fragment {

   View view;

    private RecyclerView recyclerView3;

    int[]arr = {R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,
            R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,R.drawable.photo6};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.popular_fragment, container, false);

        recyclerView3 = view.findViewById(R.id.recycleView3);
        recyclerView3.setLayoutManager(new LinearLayoutManager(view.getContext()));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(arr);
        recyclerView3.setAdapter(adapter);
        recyclerView3.setHasFixedSize(true);
        return view;
    }
}