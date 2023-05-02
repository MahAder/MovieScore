package com.example.moviescore.data.model;

import java.util.List;

public interface IMovieRepository {
    void saveMovie(Movie movie);

    void deleteMovie(Movie movie);

    List<Movie> getAllMovies();

    List<WatchedMovie> getAllWatchedMovies();
}
