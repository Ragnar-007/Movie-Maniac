package com.example.recyclerviewapp;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidproject.R;
import com.example.theAdapter;


public class realdashboard extends AppCompatActivity {
    RecyclerView recyclerView;
    private theAdapter Adapter;
    private String[] data={"some","string","here"};
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.realdash_board);
        recyclerView=(RecyclerView) findViewById(R.id.movielist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapter= new theAdapter(this, data);
        recyclerView.setAdapter(Adapter);

    }
}
