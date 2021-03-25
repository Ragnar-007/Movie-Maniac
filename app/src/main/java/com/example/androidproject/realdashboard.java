package com.example.androidproject;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidproject.R;
import com.example.androidproject.theAdapter;
import com.google.firebase.auth.FirebaseAuth;


public class realdashboard extends AppCompatActivity {
    RecyclerView recyclerView;
    private theAdapter Adapter;
    private Button logout;
    private String[] data={"dummy","string","value"};
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.realdash_board);
        recyclerView=(RecyclerView) findViewById(R.id.movielist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapter= new theAdapter(this, data);
        recyclerView.setAdapter(Adapter);
        logout=findViewById(R.id.buttonl);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(realdashboard.this, MainActivity.class);
                startActivity(intent);
                finish();

            }

        });
    }
}
