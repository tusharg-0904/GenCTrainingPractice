package com.example.springbootproject;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // You can define custom queries here
    List<Book> findByAuthor(String author);
}
