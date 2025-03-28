package com.cenkgurses.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenkgurses.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    
}
