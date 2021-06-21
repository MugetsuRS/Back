package com.example.Back.Service.Impl;

import com.example.Back.Entity.Comment;
import com.example.Back.Reposiyory.CommentRepository;
import com.example.Back.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {

    CommentRepository commentRepository;

    public void deletecomment(Integer id) {
        commentRepository.deleteById(id);
    }

    public Optional<Comment> save(final Comment comment) {
        return Optional.of(commentRepository.save(comment));
    }

    //args - String commentary, String dayofadditing, MedicalClient medicalClient
    public void update(Comment comment) {
        commentRepository.save(comment);
    }

//        public Integer savecomment (Comment comment){
//        return commentRepository.save(comment).getId();
//    }
}
