package com.example.jpapractice.domain.repository;

import com.example.jpapractice.domain.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
