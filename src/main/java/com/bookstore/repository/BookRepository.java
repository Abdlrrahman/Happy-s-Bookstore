package com.bookstore.repository;

import java.util.List;

import com.bookstore.domain.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByCategory(String category);

}