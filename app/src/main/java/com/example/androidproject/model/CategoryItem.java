package com.example.androidproject.model;

import com.google.gson.annotations.SerializedName;

public class CategoryItem {

    @SerializedName("poster_path")
    private String poster_path;
    @SerializedName("title")
    private String title;
    @SerializedName("overview")
    private String overview;
    @SerializedName("release_date")
    private String release_date;
    @SerializedName("vote_average")
    private double vote_average;
    @SerializedName("original_language")
    private String original_language;



    public CategoryItem(String poster_path, String title, String overview, String release_date, double vote_average,String original_language) {
        this.poster_path = poster_path;
        this.title = title;
        this.overview = overview;
        this.release_date = release_date;
        this.vote_average = vote_average;
        this.original_language = original_language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public double getvote_average() {
        return vote_average;
    }

    public void setvote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public String getoriginal_language() {
        return original_language;
    }

    public void setoriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }
}
