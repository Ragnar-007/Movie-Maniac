package com.example.androidproject.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidproject.ApiClient;
import com.example.androidproject.DetailActivity;
import com.example.androidproject.MainActivity;
import com.example.androidproject.Movie;
import com.example.androidproject.R;
import com.example.androidproject.SignUpActivity;
import com.example.androidproject.model.CategoryItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoryItemRecyclerAdapter extends RecyclerView.Adapter<CategoryItemRecyclerAdapter.CategoryItemViewHolder> {

    private Context context;
    private List<CategoryItem> categoryItemList;

    public CategoryItemRecyclerAdapter(Context context, List<CategoryItem> categoryItemList) {
        this.context = context;
        this.categoryItemList = categoryItemList;
    }

    @NonNull
    @Override
    public CategoryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryItemViewHolder(LayoutInflater.from(context).inflate(R.layout.category_row_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemViewHolder holder, int position) {

        //holder.itemImage.setImageResource(categoryItemList.get(position).getImageId());
        Picasso.get().load("https://image.tmdb.org/t/p/w500"+categoryItemList.get(position).getPoster_path()).into(holder.itemImage);
        Log.i( "Url= ", "https://image.tmdb.org/t/p/w500"+categoryItemList.get(position).getPoster_path());
        holder.itemImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, DetailActivity.class);
                intent.putExtra("title", ""+categoryItemList.get(position).getTitle());
                intent.putExtra("image", ""+categoryItemList.get(position).getPoster_path());
                intent.putExtra("over", ""+categoryItemList.get(position).getOverview());
                intent.putExtra("rdate", ""+categoryItemList.get(position).getRelease_date());
                intent.putExtra("lang", ""+categoryItemList.get(position).getoriginal_language());
                intent.putExtra("rate", ""+categoryItemList.get(position).getvote_average());
                context.startActivity(intent);

            }
       });
    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    public static final class CategoryItemViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView Title;
        TextView Desc;
        TextView Rdate;
        TextView Lang;
        TextView Rate;

        public CategoryItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage=itemView.findViewById(R.id.item_image);
            Title=itemView.findViewById(R.id.Title);
            Desc=itemView.findViewById(R.id.Description);
            Rdate=itemView.findViewById(R.id.release_date);
            Lang=itemView.findViewById(R.id.Lang);

        }
    }
}
