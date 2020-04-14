package com.thoughtworks.theater.repository;

import com.thoughtworks.theater.entity.Movie;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, String> {
  // TODO: complete this repository

  @Query("SELECT * FROM movie WHERE has_ticket = TRUE")
  Iterable<Movie> getInTheatersMovies();

  @Query("SELECT * FROM movie WHERE year IN ('2019', '2020') AND rating > 7")
  Iterable<Movie> getNewMovies();

  @Query("SELECT * from movie ORDER BY rating DESC LIMIT 250")
  Iterable<Movie> getTop250Movies();


  @Query("SELECT * from movie WHERE title LIKE :word OR aka LIKE :word OR cast LIKE :word OR director LIKE :word OR genres LIKE :word OR tags LIKE :word")
  List<Movie> searchMovieByKeyword(@Param("word") String word);
}
