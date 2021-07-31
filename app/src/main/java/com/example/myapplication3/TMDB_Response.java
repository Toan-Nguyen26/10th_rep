package com.example.myapplication3;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TMDB_Response {

    @SerializedName("results")
    @Expose
    private ArrayList<Movie> results;

    public ArrayList<Movie> getResults() {
        return results;
    }

    @NonNull
    @Override
    public String toString() {
        return results.toString();
    }
}