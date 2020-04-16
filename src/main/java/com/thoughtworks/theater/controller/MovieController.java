package com.thoughtworks.theater.controller;

import com.thoughtworks.theater.entity.Movie;
import com.thoughtworks.theater.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movie/in_theaters")
    public Iterable<Movie> getMoviesInTheaters() {
        return movieService.getInTheatersMovies();
    }

    @GetMapping("/movie/new_movies")
    public Iterable<Movie> getNewMovies() {
        return movieService.getNewMovies();
    }

    @GetMapping("/movie/new_movies/start={start}&count={count}")
    public Iterable<Movie> getNewMovies(@PathVariable Integer start, @PathVariable Integer count) {
        return movieService.getNewMovies(start, count);
    }

    @GetMapping("/movie/top250")
    public Iterable<Movie> getTop250Movies() {
        return movieService.getTop250Movies();
    }

    @GetMapping("/movie/top250/start={start}&count={count}")
    public Iterable<Movie> getTop250Movies(@PathVariable Integer start, @PathVariable Integer count) {
        return movieService.getTop250Movies(start, count);
    }

    @GetMapping("/movie/search/keyword={keyword}")
    public Iterable<Movie> searchMovies(@PathVariable String keyword) {
        return movieService.searchMovies(keyword);
    }

    @GetMapping("/movie/similar_movies/movieId={movieId}")
    public Iterable<Movie> getSimilarMovies(@PathVariable String movieId) {
        return movieService.getSimilarMovies(movieId);
    }

    @GetMapping("/movie/detail/{movieId}")
    public Movie getMovieById(@PathVariable String movieId) {
        return movieService.getMovieById(movieId);
    }

    @GetMapping("/movie/genres/{genres}")
    public Iterable<Movie> getMovieByGenres(@PathVariable String genres) {
        return movieService.getMovieByGenres(genres);
    }

    @GetMapping("/movie/category/genres={genres}&year={year}&tag={tag}&start={start}&count={count}")
    public Iterable<Movie> getCategoryMovieByCount(@PathVariable String genres,
                                                   @PathVariable String year,
                                                   @PathVariable String tag,
                                                   @PathVariable Integer start,
                                                   @PathVariable Integer count) {
        return movieService.getCategoryMovies(genres, year, tag, start, count);
    }
}
