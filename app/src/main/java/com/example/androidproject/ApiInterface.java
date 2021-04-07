package com.example.androidproject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

//https://api.themoviedb.org/3/movie/now_playing?api_key=89d8da2d7cdfe25b355b5099bb24bc94&language=en-US&page=1
public interface ApiInterface {

    @GET("/3/movie/{category}")
    Call<Movied> getMovies(
            @Path("category") String category,
            @Query("api_key") String apikey,
            @Query("language") String language,
            @Query("page") int page
    );
}
