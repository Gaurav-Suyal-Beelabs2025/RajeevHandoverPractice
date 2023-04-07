package com.example.newapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class VideoFragment extends Fragment {

    View view;
    private RecyclerView recyclerView4;

    int[]arr = {R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,
            R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,R.drawable.photo6};





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.video_fragment, container, false);

        recyclerView4 = view.findViewById(R.id.recycleViewVideoFragment);
        recyclerView4.setLayoutManager(new LinearLayoutManager(view.getContext()));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(arr);
        recyclerView4.setAdapter(adapter);
        recyclerView4.setHasFixedSize(true);
        return view;
    }
}