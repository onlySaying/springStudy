package com.example.bookstorewebkit.domain.responsity;

import com.example.bookstorewebkit.domain.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
