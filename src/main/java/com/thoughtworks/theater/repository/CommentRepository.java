package com.thoughtworks.theater.repository;

import com.thoughtworks.theater.entity.Comment;
import com.thoughtworks.theater.entity.Movie;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Comment, String> {
    @Query("SELECT * from comment WHERE movie_id = :movie_id")
    Iterable<Comment> getCommentByMovieId(@Param("movie_id") String movieId);
}
