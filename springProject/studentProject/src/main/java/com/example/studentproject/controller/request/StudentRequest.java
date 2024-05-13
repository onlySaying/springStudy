package com.example.studentproject.controller.request;

import com.example.studentproject.domain.model.School;
import com.example.studentproject.domain.model.Score;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

public class StudentRequest {
    @Data
    public static class Create{
        private String name;
        private Long schoolId;
        private String schoolNum;
        private String grade;
        private List<ScoreRequest.Create> scores;
    }

    @Data
    public static class Update {
        private Long schoolId;
        private String grade;
        private List<ScoreRequest.Create> scores;
    }
}
