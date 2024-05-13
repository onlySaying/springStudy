package com.example.studentproject.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Score {
    @Id @GeneratedValue
    private Long id;
    private String semester;
    private Double score;
    @ManyToOne
    private Student owner;
}
