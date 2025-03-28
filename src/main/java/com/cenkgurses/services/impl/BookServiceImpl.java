package com.cenkgurses.services.impl;

import java.util.List;
import java.util.Optional;

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

    public Book getBook(Long id) {

        Optional<Book> optional = bookRepository.findById(id);

        if (optional.isEmpty()) {
            return null;
        }

        Book book = optional.get();

        return book;
    }
}
