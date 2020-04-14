package com.thoughtworks.theater.repository;

import com.thoughtworks.theater.entity.Movie;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, String> {
    // TODO: complete this repository

    @Query("SELECT * FROM movie WHERE has_ticket = TRUE")
    Iterable<Movie> getInTheatersMovies();

    @Query("SELECT * FROM movie WHERE year IN ('2019', '2020') AND rating > 7")
    Iterable<Movie> getNewMovies();

    @Query("SELECT * from movie ORDER BY rating DESC LIMIT 250")
    Iterable<Movie> getTop250Movies();

    @Query("SELECT * from movie ORDER BY rating DESC LIMIT :start,:count")
    Iterable<Movie> getTop250Movies(@Param("start") Integer start,
                                    @Param("count") Integer count);

    @Query("SELECT * FROM movie WHERE id = :id")
    Movie getMovieById(@Param("id") String id);

}
