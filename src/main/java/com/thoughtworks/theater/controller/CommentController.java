package com.thoughtworks.theater.controller;

import com.thoughtworks.theater.entity.Comment;
import com.thoughtworks.theater.entity.Movie;
import com.thoughtworks.theater.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/movie/comment/{movieId}")
    public Iterable<Comment> getCommentByMovieId(@PathVariable String movieId) {
        // TODO: implement this method
        return commentService.getCommentByMovieId(movieId);
    }
}
