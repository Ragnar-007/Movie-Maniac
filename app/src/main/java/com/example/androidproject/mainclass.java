package com.example.androidproject;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidproject.adapter.CategoryItemRecyclerAdapter;
import com.example.androidproject.adapter.vetricalrecycleradapter;
import com.example.androidproject.model.AllCategory;
import com.example.androidproject.model.CategoryItem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.androidproject.R.id.buttonl;
import static com.example.androidproject.R.id.item_recycler;

public class mainclass extends AppCompatActivity {
    public static final String API_KEY="89d8da2d7cdfe25b355b5099bb24bc94";
    public static String CATEGORY;
    public static final String LANGUAGE="en-US";
    public static final int PAGE=1;
    private Button button;


    RecyclerView itemRecyclerView;
    CategoryItemRecyclerAdapter categoryItemRecyclerAdapter;
    RecyclerView maincategoryrecycler;
    vetricalrecycleradapter vetricalrecycleradapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newdashboard);

        button = findViewById(R.id.buttonl);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mainclass.this,DashboardActivity.class);
                startActivity(intent);
                finish();
            }
        });



        List<AllCategory> allCategoryList = new ArrayList<>();

        List<CategoryItem> categoryItemList1 =new ArrayList<>();

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<Movied> call = apiService.getMovies("popular",API_KEY,LANGUAGE,PAGE);
        call.enqueue(new Callback<Movied>() {

            @Override
            public void onResponse(Call<Movied> call, Response<Movied> response) {
                List<Movie> list=response.body().getMovieList();
                Log.d("TAG","Response = "+categoryItemList1);
                for (Movie m:list)
                {
                    categoryItemList1.add(new CategoryItem(m.getPoster_path(),m.getTitle(),m.getOverview(),m.getRelease_date(),m.getRate(),m.getLang()));
                }
                allCategoryList.add(new AllCategory("LATEST MOVIES", categoryItemList1));
                Log.i("size=",""+categoryItemList1.size());
                setMaincategoryrecycler(allCategoryList);
            }

            @Override
            public void onFailure(Call<Movied> call, Throwable t) {
                Log.d("TAG","Response = "+t.toString());
            }

        });



           List<CategoryItem> categoryItemList2 =new ArrayList<>();

        ApiInterface apiService2 = ApiClient.getClient().create(ApiInterface.class);
        Call<Movied> call2 = apiService2.getMovies("popular",API_KEY,LANGUAGE,PAGE);
        call2.enqueue(new Callback<Movied>() {

            @Override
            public void onResponse(Call<Movied> call, Response<Movied> response) {
                List<Movie> list=response.body().getMovieList();
                Log.d("TAG","Response = "+categoryItemList2);
                for (Movie m:list)
                {
                    categoryItemList2.add(new CategoryItem(m.getPoster_path(),m.getTitle(),m.getOverview(),m.getRelease_date(),m.getRate(),m.getLang()));
                }
                allCategoryList.add(new AllCategory("POPULAR", categoryItemList2));
                Log.i("size=",""+categoryItemList2.size());
                setMaincategoryrecycler(allCategoryList);
            }

            @Override
            public void onFailure(Call<Movied> call2, Throwable t) {
                Log.d("TAG","Response = "+t.toString());
            }

        });


             List<CategoryItem> categoryItemList3 =new ArrayList<>();

        ApiInterface apiService3 = ApiClient.getClient().create(ApiInterface.class);
        Call<Movied> call3 = apiService3.getMovies("now_playing",API_KEY,LANGUAGE,PAGE);
        call3.enqueue(new Callback<Movied>() {

            @Override
            public void onResponse(Call<Movied> call3, Response<Movied> response) {
                List<Movie> list=response.body().getMovieList();
                Log.d("TAG","Response = "+categoryItemList3);
                for (Movie m:list)
                {
                    categoryItemList3.add(new CategoryItem(m.getPoster_path(),m.getTitle(),m.getOverview(),m.getRelease_date(),m.getRate(),m.getLang()));
                }
                allCategoryList.add(new AllCategory("NOW PLAYING", categoryItemList3));
                Log.i("size=",""+categoryItemList3.size());
                setMaincategoryrecycler(allCategoryList);
            }

            @Override
            public void onFailure(Call<Movied> call3, Throwable t) {
                Log.d("TAG","Response = "+t.toString());
            }

        });


                List<CategoryItem> categoryItemList4 =new ArrayList<>();

        ApiInterface apiService4 = ApiClient.getClient().create(ApiInterface.class);
        Call<Movied> call4 = apiService4.getMovies("top_rated",API_KEY,LANGUAGE,PAGE);
        call4.enqueue(new Callback<Movied>() {

            @Override
            public void onResponse(Call<Movied> call4, Response<Movied> response) {
                List<Movie> list=response.body().getMovieList();
                Log.d("TAG","Response = "+categoryItemList4);
                for (Movie m:list)
                {
                    categoryItemList4.add(new CategoryItem(m.getPoster_path(),m.getTitle(),m.getOverview(),m.getRelease_date(),m.getRate(),m.getLang()));
                }
                allCategoryList.add(new AllCategory("TOP RATED", categoryItemList4));
                Log.i("size=",""+categoryItemList4.size());
                setMaincategoryrecycler(allCategoryList);
            }

            @Override
            public void onFailure(Call<Movied> call4, Throwable t) {
                Log.d("TAG","Response = "+t.toString());
            }

        });





                List<CategoryItem> categoryItemList5 =new ArrayList<>();

        ApiInterface apiService5 = ApiClient.getClient().create(ApiInterface.class);
        Call<Movied> call5 = apiService5.getMovies("upcoming",API_KEY,LANGUAGE,PAGE);
        call5.enqueue(new Callback<Movied>() {

            @Override
            public void onResponse(Call<Movied> call5, Response<Movied> response) {
                List<Movie> list=response.body().getMovieList();
                Log.d("TAG","Response = "+categoryItemList5);
                for (Movie m:list)
                {
                    categoryItemList5.add(new CategoryItem(m.getPoster_path(),m.getTitle(),m.getOverview(),m.getRelease_date(),m.getRate(),m.getLang()));
                }
                allCategoryList.add(new AllCategory("UPCOMING", categoryItemList5));
                Log.i("size=",""+categoryItemList5.size());
                setMaincategoryrecycler(allCategoryList);
            }

            @Override
            public void onFailure(Call<Movied> call5, Throwable t) {
                Log.d("TAG","Response = "+t.toString());
            }

        });


    }



    private void setMaincategoryrecycler(List<AllCategory> allCategoryList){

        if(allCategoryList.size()<4) return;
        maincategoryrecycler=findViewById(R.id.vertical_recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        maincategoryrecycler.setLayoutManager(layoutManager);
        vetricalrecycleradapter= new vetricalrecycleradapter(this, allCategoryList);
        maincategoryrecycler.setAdapter(vetricalrecycleradapter);
    }
}
