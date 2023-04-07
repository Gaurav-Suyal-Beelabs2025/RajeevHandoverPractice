package com.example.newapp;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FollowingFragment extends Fragment {

   View view;
   RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.following_fragment, container, false);

        recyclerView = view.findViewById(R.id.recycleViewFollowing);

        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
        FollowingAdapter followingAdapter = new FollowingAdapter();
        recyclerView.setAdapter(followingAdapter);

        return view;
    }
}