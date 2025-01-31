package com.example.runfile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.runfile.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
