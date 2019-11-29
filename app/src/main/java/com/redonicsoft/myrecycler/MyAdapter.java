package com.redonicsoft.myrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String[] title;
    String[]  desc;
    int[] image;

    public MyAdapter(Context context, String[] title, String[] desc, int[] image) {
        this.context = context;
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sample_layout, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.titleTextView.setText(title[position]);
        holder.descTextView.setText(desc[position]);
        holder.flagImageView.setImageResource(image[position]);

    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView titleTextView;
        TextView descTextView;
        ImageView flagImageView;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

           titleTextView = itemView.findViewById(R.id.titletextVieId);
           descTextView = itemView.findViewById(R.id.descTextViewId);
           flagImageView = itemView.findViewById(R.id.myImageViewId);

        }
    }

}
