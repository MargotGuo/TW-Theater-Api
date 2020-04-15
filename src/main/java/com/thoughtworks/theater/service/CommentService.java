package com.thoughtworks.theater.service;

import com.thoughtworks.theater.entity.Comment;
import com.thoughtworks.theater.entity.Movie;
import com.thoughtworks.theater.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Iterable<Comment> getCommentByMovieId(String movieId) {
        return commentRepository.getCommentByMovieId(movieId);
    }
}
