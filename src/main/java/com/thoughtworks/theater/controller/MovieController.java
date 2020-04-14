package com.thoughtworks.theater.controller;

import com.thoughtworks.theater.entity.Movie;
import com.thoughtworks.theater.service.MovieService;
import org.springframework.data.repository.query.Param;
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
    // TODO: implement this method
    return null;
  }

  @GetMapping("/movie/new_movies")
  public Iterable<Movie> getNewMovies() {
    // TODO: implement this method
    return movieService.getNewMovies();
  }

  @GetMapping("/movie/top250")
  public Iterable<Movie> getTop250Movies() {
    // TODO: implement this method
    return null;
  }

  @GetMapping("/movie/top250?start={start}&count={count}")
  public Iterable<Movie> getTop250Movies(@PathVariable int start, @PathVariable int count) {
    // TODO implement this method
    return null;
  }

  @GetMapping("/movie/search?keyword={keyword}")
  public Iterable<Movie> searchMovies(@PathVariable String keyword) {
    // TODO: implement this method
    // 这里我没考虑清楚诶。。如果用户输入多个关键字用空格隔开，这里该怎么写
    return null;
  }

  @GetMapping("/movie/similar_movies?movieId={movieId}")
  public Iterable<Movie> getSimilarMovies(@PathVariable String movieId) {
    // TODO: implement this method
    return null;
  }

  @GetMapping("/movie/detail/{movieId}")
  public Movie getMovieById(@PathVariable String movieId) {
    // TODO: implement this method
    return null;
  }

  @GetMapping("/movie/{tag}")
  public Movie getMovieByTag(@PathVariable String tag) {
    // TODO: implement this method
    return null;
  }

}
