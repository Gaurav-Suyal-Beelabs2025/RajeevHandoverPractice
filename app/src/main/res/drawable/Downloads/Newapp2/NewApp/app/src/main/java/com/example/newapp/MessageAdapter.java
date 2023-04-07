package com.example.newapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MyViewHolder> {

    int[] img;
    public MessageAdapter(int[] img) {
        this.img = img;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_itemlayout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //holder.circleImageView.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return img.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CircleImageView circleImageView;
        TextView textViewTitle;
        TextView textViewMessage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

//            circleImageView = itemView.findViewById(R.id.circle_img1);
//            textViewTitle = itemView.findViewById(R.id.textKosh);
//            textViewMessage = itemView.findViewById(R.id.textKosh1);
        }
    }
}
