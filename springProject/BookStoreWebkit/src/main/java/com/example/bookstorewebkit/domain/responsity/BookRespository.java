package com.example.bookstorewebkit.domain.responsity;

import com.example.bookstorewebkit.domain.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRespository extends JpaRepository<Book, Long> {
}
