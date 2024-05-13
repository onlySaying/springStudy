package com.example.studentproject.controller.response;

import com.example.studentproject.domain.model.Score;
import lombok.Builder;
import lombok.Data;

public class ScoreResponse {
    @Data
    @Builder
    public static class Detail {
        private Long id;
        private String semester;
        private Double score;

        public static Detail of(Score score){
            return Detail.builder()
                    .id(score.getId())
                    .semester(score.getSemester())
                    .score(score.getScore())
                    .build();
        }
    }
}
