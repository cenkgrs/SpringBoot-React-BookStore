package com.cenkgurses.services.impl;

import com.cenkgurses.entities.Comment;
import com.cenkgurses.repositories.CommentRepository;
import com.cenkgurses.services.ICommentService;

public class CommentServiceImpl implements ICommentService{

    private CommentRepository commentRepository;
    
    public Boolean saveComment(Comment comment) {

        Comment savedComment = commentRepository.save(comment);

        return true;
    }

}
