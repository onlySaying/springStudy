package com.example.studentproject.domain.repository;

import com.example.studentproject.domain.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
