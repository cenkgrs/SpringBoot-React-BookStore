package com.cenkgurses.services;

import java.util.List;

import com.cenkgurses.entities.Book;

public interface IBookService {
    
    public List<Book> getBooks();

    public Book getBook(Long id);
}
