package com.thoughtworks.theater.repository;

import com.thoughtworks.theater.entity.Movie;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, String> {
  // TODO: complete this repository

  @Query("SELECT * FROM movie WHERE has_ticket = TRUE")
  Iterable<Movie> getInTheatersMovies();

  @Query("SELECT * FROM movie WHERE year IN ('2019', '2020') AND rating > 7")
  Iterable<Movie> getNewMovies();

}
