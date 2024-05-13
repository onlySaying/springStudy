package com.example.studentproject.controller.request;

import lombok.Data;

public class ScoreRequest {
    @Data
    public static class Create{
        private String semester;
        private Double score;
    }
}
