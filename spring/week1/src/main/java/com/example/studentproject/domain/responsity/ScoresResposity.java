package com.example.studentproject.domain.responsity;

import com.example.studentproject.domain.model.Scores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoresResposity extends JpaRepository<Scores, Long> {
}
