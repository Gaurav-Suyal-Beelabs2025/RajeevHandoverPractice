package com.example.handhoverpractice


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PayoutAdpter (private  val list: ArrayList<String>): RecyclerView.Adapter<PayoutAdpter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.insentive_itamlist, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return  list.size
    }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    }

}







