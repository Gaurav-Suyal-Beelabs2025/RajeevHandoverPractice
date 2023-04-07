package com.example.newapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NearByFragment extends Fragment {

    View view;
    private RecyclerView recyclerView1;

    int[]arr = {R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,
            R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,R.drawable.photo6};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.nearby_fragment, container, false);

        recyclerView1 = view.findViewById(R.id.recycleView1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(view.getContext()));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(arr);
        recyclerView1.setAdapter(adapter);
        recyclerView1.setHasFixedSize(true);

        return view;
    }
}