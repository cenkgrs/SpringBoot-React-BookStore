package com.cenkgurses.controllers.impl;

import com.cenkgurses.controllers.ICommentController;
import com.cenkgurses.entities.Comment;
import com.cenkgurses.services.impl.CommentServiceImpl;

public class CommentController implements ICommentController{
    
    private CommentServiceImpl commentService;

    public Boolean saveComment(Comment comment) {
        
        return commentService.saveComment(comment);
    }
}
