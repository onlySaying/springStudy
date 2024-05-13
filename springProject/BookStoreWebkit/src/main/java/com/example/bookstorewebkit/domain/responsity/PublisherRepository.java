package com.example.bookstorewebkit.domain.responsity;

import com.example.bookstorewebkit.domain.model.Book;
import com.example.bookstorewebkit.domain.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
