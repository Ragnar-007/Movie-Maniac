package com.example.androidproject.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidproject.R;
import com.example.androidproject.model.AllCategory;
import com.example.androidproject.model.CategoryItem;

import java.util.List;

public class vetricalrecycleradapter extends RecyclerView.Adapter<vetricalrecycleradapter.MainViewHolder> {

    private Context context;
    private List<AllCategory> allCategoryList;

    public vetricalrecycleradapter(Context context, List<AllCategory> allCategoryList) {
        this.context = context;
        this.allCategoryList = allCategoryList;
    }


    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(context).inflate(R.layout.verticalrecycler_row, parent, false ));
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.categoryTitle.setText(allCategoryList.get(position).getCategoryTitle());
        setCatItemRecycler(holder.itemRecycler,allCategoryList.get(position).getCategoryItemList());

    }

    @Override
    public int getItemCount() {
        return allCategoryList.size();
    }

    public static final class MainViewHolder extends RecyclerView.ViewHolder{
        TextView categoryTitle;
        RecyclerView itemRecycler;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryTitle=itemView.findViewById(R.id.cat_title);
            itemRecycler=itemView.findViewById(R.id.item_recycler);
        }
    }
    private void setCatItemRecycler(RecyclerView recyclerView, List<CategoryItem> categoryItemList){
        Log.i("size=",""+categoryItemList.size());
        CategoryItemRecyclerAdapter itemRecyclerAdapter=new CategoryItemRecyclerAdapter(context,categoryItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(itemRecyclerAdapter);
    }
}
