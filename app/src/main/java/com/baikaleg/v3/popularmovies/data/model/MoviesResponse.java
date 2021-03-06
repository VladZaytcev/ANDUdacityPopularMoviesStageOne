package com.baikaleg.v3.popularmovies.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MoviesResponse {

    @SerializedName("results")
    @Expose
    private final List<Movie> movies = null;

    public List<Movie> getMovies() {
        return movies;
    }
} 