package com.example;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidproject.R;


public class theAdapter extends RecyclerView.Adapter<theAdapter.theViewHolder> {
    private Context context;
    private String[] data;
    public theAdapter(Context context, String[] data){
        this.data=data;
        this.context=context;
    }
    @NonNull
    @Override
    public theViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.card,parent,false);
        return new theViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull theViewHolder holder, int position) {
        String item=data[position];
        holder.mname.setText(item);
        holder.rdate.setText(item);
        holder.rate.setText(item);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class theViewHolder extends RecyclerView.ViewHolder{
        ImageView imageIcon;
        TextView mname;
        TextView rate;
        TextView rdate;
        public theViewHolder(@NonNull View itemView) {
            super(itemView);
            imageIcon=(ImageView) itemView.findViewById(R.id.image);
            mname=(TextView) itemView.findViewById(R.id.name);
            rate=(TextView) itemView.findViewById(R.id.rating);
            rdate=(TextView) itemView.findViewById(R.id.release);
        }
    }
}
