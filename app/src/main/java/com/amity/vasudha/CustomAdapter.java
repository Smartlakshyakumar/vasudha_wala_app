package com.amity.vasudha;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import android.content.Intent;
import android.content.IntentFilter;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.myViewHolder> {

    ArrayList list;

    public CustomAdapter (ArrayList list){
        this.list = list;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view    = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.recycler_view_view,
                parent,
                false);
        myViewHolder holder = new myViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.recycleViewText.setText(list.get(position).toString());
        holder.recycleViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,list.get(position).toString(), Snackbar.LENGTH_LONG).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class  myViewHolder extends RecyclerView.ViewHolder{
        TextView recycleViewText;
        Button recycleViewButton;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            recycleViewText = itemView.findViewById(R.id.recyclerViewText);
            recycleViewButton = itemView.findViewById(R.id.recyclerViewButton);
        }
    }

}