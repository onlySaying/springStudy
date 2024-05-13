package com.example.studentproject.controller.response;

import com.example.studentproject.domain.model.Student;
import lombok.Builder;
import lombok.Data;

import java.util.List;

public class StudentResponse {
    @Data
    @Builder
    public static class Detail{
        private Long id;
        private String name;
        private SchoolResponse.Detail school;
        private String grade;
        private List<ScoreResponse.Detail> scores;

        public static Detail of(Student student) {
            return StudentResponse.Detail.builder()
                    .id(student.getId())
                    .name(student.getName())
                    .school(SchoolResponse.Detail.of(student.getSchool()))
                    .grade(student.getGrade())
                    .scores(student.getScores().stream().map(ScoreResponse.Detail::of).toList())
                    .build();
        }
    }

    @Data
    @Builder
    public static class ListElem {
        private Long id;
        private String name;

        public static ListElem of(Student student) {
            return ListElem.builder()
                    .id(student.getId())
                    .name(student.getName())
                    .build();
        }

    }
}
