package com.example.androidproject;

import com.google.gson.annotations.SerializedName;

public class info {

    @SerializedName("title")
    private String title;

    @SerializedName("overview")
    private String overview;

    @SerializedName("release_date")
    private String release_date;

    @SerializedName("original_language")
    private String original_language;

    @SerializedName("vote_average")
    private double rating;

    //constructor
    public info(String title, String overview, String release_date, String original_language, double rating) {
        this.title = title;
        this.overview = overview;
        this.release_date = release_date;
        this.original_language = original_language;
        this.rating = rating;
    }

    //getter and setter
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

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
