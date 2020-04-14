package com.thoughtworks.theater.service;

import com.thoughtworks.theater.entity.Movie;
import com.thoughtworks.theater.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public Iterable<Movie> searchMovies(String keyword) {
        String[] keywords = keyword.split(" ");
        return Arrays
                .stream(keywords)
                .map(word -> movieRepository.searchMovieByKeyword("%" + word + "%"))
                .flatMap((Function<List<Movie>, Stream<Movie>>) Collection::stream)
                .distinct()
                .sorted((o1, o2) -> matchedKeywordCount(o2, keywords) - matchedKeywordCount(o1, keywords))
                .collect(Collectors.toList());
    }

    private int matchedKeywordCount(Movie movie, String[] keywords) {
        return (int) Arrays.stream(keywords)
                .filter(keyword -> movie.toString().contains(keyword))
                .count();
    }


    // TODO: complete this service
}
