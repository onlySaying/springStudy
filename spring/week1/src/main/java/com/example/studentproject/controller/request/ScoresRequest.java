package com.example.studentproject.controller.request;

import com.example.studentproject.domain.model.Scores;
import lombok.Data;

import java.util.List;

public class ScoresRequest {
    @Data
    public static class createStudent
    {
        private String semester;
        private float score;
    }
}
