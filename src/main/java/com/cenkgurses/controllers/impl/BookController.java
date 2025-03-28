package com.cenkgurses.controllers.impl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenkgurses.entities.Book;
import com.cenkgurses.services.impl.BookServiceImpl;

@RequestMapping("/api/v1/books")
@RestController
public class BookController {
    
    private BookServiceImpl bookService;

    @GetMapping(path = "/get-all-books")
    public List<Book> getBooks() {

        return bookService.getBooks();
    }

    @GetMapping(path = "/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }
}
