package com.example.studentproject.controller.response;

import com.example.studentproject.domain.model.School;
import lombok.Builder;
import lombok.Data;

public class SchoolResponse {
    @Data
    @Builder
    public static class Detail{
        private Long id;
        private String name;

        public static Detail of(School school){
            return Detail.builder()
                    .id(school.getId())
                    .name(school.getName())
                    .build();
        }
    }

}
