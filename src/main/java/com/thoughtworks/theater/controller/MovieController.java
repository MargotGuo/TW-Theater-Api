package com.thoughtworks.theater.controller;

import com.thoughtworks.theater.entity.Movie;
import com.thoughtworks.theater.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movie/in_theaters")
    public Iterable<Movie> getMoviesInTheaters() {
        // TODO: implement this method
        return movieService.getInTheatersMovies();
    }

    @GetMapping("/movie/new_movies")
    public Iterable<Movie> getNewMovies() {
        // TODO: implement this method
        return movieService.getNewMovies();
    }

    @GetMapping("/movie/top250")
    public Iterable<Movie> getTop250Movies() {
        // TODO: implement this method
        return movieService.getTop250Movies();
    }

    @GetMapping("/movie/top250/start={start}&count={count}")
    public Iterable<Movie> getTop250Movies(@PathVariable Integer start, @PathVariable Integer count) {
        // TODO implement this method
        return movieService.getTop250Movies(start, count);
    }

    @GetMapping("/movie/search/keyword={keyword}")
    public Iterable<Movie> searchMovies(@PathVariable String keyword) {
        // TODO: implement this method
        String decodeKeyword = null;
        try {
            decodeKeyword = URLDecoder.decode(keyword, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return movieService.searchMovies(decodeKeyword);
    }

    @GetMapping("/movie/similar_movies/movieId={movieId}")
    public Iterable<Movie> getSimilarMovies(@PathVariable String movieId) {
        // TODO: implement this method
        return movieService.getSimilarMovies(movieId);
    }

    @GetMapping("/movie/detail/{movieId}")
    public Movie getMovieById(@PathVariable String movieId) {
        // TODO: implement this method
        return movieService.getMovieById(movieId);
    }

    @GetMapping("/movie/{tag}")
    public Movie getMovieByTag(@PathVariable String tag) {
        // TODO: implement this method
        return null;
    }

}
