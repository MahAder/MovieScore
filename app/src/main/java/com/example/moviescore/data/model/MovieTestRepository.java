package com.example.moviescore.data.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MovieTestRepository implements IMovieRepository {
    private final static String LOG = "MovieRepository";

    @Override
    public void saveMovie(Movie movie) {
        log("Movie Saved " + movie.name);
    }

    @Override
    public void deleteMovie(Movie movie) {
        log("Movie Deleted " + movie.name);
    }

    @Override
    public List<Movie> getAllMovies() {
        return new ArrayList<>();
    }

    @Override
    public List<WatchedMovie> getAllWatchedMovies() {
        return new ArrayList<>();
    }

    private void log(String message) {
        Log.d(LOG, message);
    }
}
