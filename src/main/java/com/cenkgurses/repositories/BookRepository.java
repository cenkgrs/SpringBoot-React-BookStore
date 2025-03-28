package com.cenkgurses.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cenkgurses.entities.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
