package com.example.androidproject;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Movied {

        @SerializedName("results")
        private List<Movie> movieList;

    public Movied(List<Movie> movieList) {
        this.movieList = movieList;

    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }
}

