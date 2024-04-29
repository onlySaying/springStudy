package com.example.studentproject.domain.responsity;

import com.example.studentproject.domain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentResposity extends JpaRepository<Student, Long> {
}
