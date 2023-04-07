package com.example.newapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MatchFragment extends Fragment {

    View view;
    private RecyclerView recyclerView;
    int[] arr = {R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,
            R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,R.drawable.photo6,};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.match_fragment, container, false);

        recyclerView = view.findViewById(R.id.recycleViewMatchFragment);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        MatchAdapter matchAdapter = new MatchAdapter(arr);
        recyclerView.setAdapter(matchAdapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }
}