package com.thoughtworks.theater.service;

import com.thoughtworks.theater.entity.Movie;
import com.thoughtworks.theater.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.nio.charset.MalformedInputException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
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

    public Iterable<Movie> getNewMovies(Integer start, Integer count) {
        return movieRepository.getNewMovies(start, count);
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
        return Arrays.stream(keywords)
                .map(word -> movieRepository.searchMovieByKeyword("%" + word + "%"))
                .flatMap((Function<List<Movie>, Stream<Movie>>) Collection::stream)
                .distinct()
                .filter(movie -> matchedKeywordCount(movie, keywords) >= 0.5 * keywords.length)
                .sorted((o1, o2) -> matchedKeywordCount(o2, keywords) - matchedKeywordCount(o1, keywords))
                .collect(Collectors.toList());
    }

    private int matchedKeywordCount(Movie movie, String[] keywords) {
        return (int) Arrays.stream(keywords)
                .filter(keyword -> movie.toString().contains(keyword))
                .count();
    }

    public List<Movie> getSimilarMovies(String movieId) {
        Movie movie = movieRepository.getMovieById(movieId);
        List<String> genres = Arrays.stream(movie.getGenres().split(",")).collect(Collectors.toList());
        List<String> tags = Arrays.stream(movie.getTags().split(",")).collect(Collectors.toList());
        List<String> director = Arrays.stream(movie.getDirector().split(",")).collect(Collectors.toList());
        List<Movie> similarMovies = movieRepository.getAllMovie()
                .stream()
                .sorted((o1, o2) -> similarPercent(o2, genres, tags, director) - similarPercent(o1, genres, tags, director))
                .filter(m -> similarPercent(m, genres, tags, director) > 1)
                .limit(11)
                .collect(Collectors.toList());
        similarMovies.remove(0);
        return similarMovies;
    }

    public int similarPercent(Movie movie, List<String> genres, List<String> tags, List<String> directors) {
        int result = 0;
        for (String genre : genres) {
            if (movie.getGenres().contains(genre)) {
                result += 3;
            }
        }
        for (String tag : tags) {
            if (movie.getTags().contains(tag)) {
                result += 2;
            }
        }
        for (String director : directors) {
            if (movie.getTags().contains(director)) {
                result++;
            }
        }
        return result;
    }

    public Iterable<Movie> getMovieByGenres(String genres) {
        return movieRepository.getMovieByGenres("%" + genres + "%");
    }

    public Iterable<Movie> getCategoryMovies(String genres, String year, String tag, Integer start, Integer count) {
        return movieRepository.getCategoryMovies("%" + genres + "%", year, "%" + tag + "%", start, count);
    }
}
