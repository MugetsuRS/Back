package com.example.Back.Service.Impl;

import com.example.Back.Entity.Comment;
import com.example.Back.Reposiyory.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl {

    @Autowired
    CommentRepository commentRepository;

    public void deletecomment (Integer id){
        commentRepository.deleteById(id);
    }

    public Integer savecomment (Comment comment){
        return commentRepository.save(comment).getId();
    }
}
