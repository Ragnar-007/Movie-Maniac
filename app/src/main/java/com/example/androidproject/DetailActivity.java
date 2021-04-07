package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.quicksettings.Tile;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    ImageView itemImage;
    TextView Title;
    TextView Desc;
    TextView Rdate;
    TextView Lang;
    TextView Rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descrip);
        itemImage=(ImageView)findViewById(R.id.item_image1);
        Title=(TextView)findViewById(R.id.Title);
        Desc=(TextView)findViewById(R.id.Description);
        Rdate=(TextView)findViewById(R.id.release_date);
        Lang=(TextView)findViewById(R.id.Lang);

        Bundle i= getIntent().getExtras();
        String title = i.getString("title",""+i.toString());
        Title.setText(title);
        String des=i.getString("over",""+i.toString());
        Desc.setText(des);
        String rd=i.getString("rdate",""+i.toString());
        Rdate.setText(rd);
        String La=i.getString("lang",""+i.toString());
        Lang.setText(La);

        int pic=i.getInt("image");
        itemImage.setImageResource(pic);

    }
}