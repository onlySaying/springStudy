package com.example.studentproject.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Scores {
    @Id
    @GeneratedValue
    private Long id;
    private String semester;
    private float score;

    @ManyToOne
    private Student student;

}
