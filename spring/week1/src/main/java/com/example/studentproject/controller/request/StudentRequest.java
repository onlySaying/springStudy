package com.example.studentproject.controller.request;

import com.example.studentproject.domain.model.Scores;
import lombok.Data;

import java.util.List;


public class StudentRequest {
    @Data
    public static class createStudent
    {
        private String name;
        private String grade;
        private String schoolNum;
        private List<ScoresRequest.createStudent> scores;
    }
}
