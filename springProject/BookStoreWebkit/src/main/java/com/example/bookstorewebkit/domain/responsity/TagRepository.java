package com.example.bookstorewebkit.domain.responsity;

import com.example.bookstorewebkit.domain.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
