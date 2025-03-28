package com.cenkgurses.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cenkgurses.entities.Book;
import com.cenkgurses.repositories.BookRepository;
import com.cenkgurses.services.IBookService;

@Service
public class BookServiceImpl implements IBookService{

    private BookRepository bookRepository;

    public List<Book> getBooks() {

        return bookRepository.findAll();
    }
}
