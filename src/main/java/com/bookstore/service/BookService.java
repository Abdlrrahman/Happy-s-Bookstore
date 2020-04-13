package com.bookstore.service;

import java.util.List;

import com.bookstore.domain.Book;

import org.springframework.stereotype.Service;

@Service
public interface BookService {

    List<Book> findAll();

    Book findById(Long id);

}
