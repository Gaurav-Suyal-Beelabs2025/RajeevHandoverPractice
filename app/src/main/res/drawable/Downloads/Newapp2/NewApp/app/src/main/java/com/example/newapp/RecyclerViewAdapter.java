package com.example.newapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    int []arr;

    public RecyclerViewAdapter(int[] arr) {
        this.arr = arr;
    }


    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_activity,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageView.setImageResource(arr[position]);
        holder.imageView1.setImageResource(arr[position]);

    }

    @Override
    public int getItemCount() {
        return arr.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView,imageView1;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.item_imgView);
            imageView1 = itemView.findViewById(R.id.item_imgView1);
        }
    }
}
