package com.thoughtworks.theater.service;

import com.thoughtworks.theater.entity.Movie;
import com.thoughtworks.theater.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Iterable<Movie> getInTheatersMovies() {
        return movieRepository.getInTheatersMovies();
    }

    public Iterable<Movie> getNewMovies() {
        return movieRepository.getNewMovies();
    }

    public Iterable<Movie> getTop250Movies() {
        return movieRepository.getTop250Movies();
    }

    public Iterable<Movie> getTop250Movies(Integer start, Integer count) {
        return movieRepository.getTop250Movies(start, count);
    }

    public Movie getMovieById(String id) {
        return movieRepository.getMovieById(id);
    }
    // TODO: complete this service
}
