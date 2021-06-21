package com.example.Back.Service;

import com.example.Back.Entity.Comment;

import java.util.Optional;

public interface CommentService {

    void deletecomment(Integer id);

    Optional<Comment> save(final Comment comment);
}
