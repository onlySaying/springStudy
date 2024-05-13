package com.example.studentproject.domain.repository;

import com.example.studentproject.domain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsByName(String name);
    boolean existsBySchoolNum(String schoolNum);
}
