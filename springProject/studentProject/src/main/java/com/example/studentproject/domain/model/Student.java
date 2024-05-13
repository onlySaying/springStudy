package com.example.studentproject.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class Student {
    @Id @GeneratedValue
    private Long id;
    @ManyToOne
    @Setter
    private School school;
    @Column(unique = true)
    private String name;
    @Column(unique = true)
    private String schoolNum;
    @Setter
    private String grade;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "owner")
    @Builder.Default
    private List<Score> scores = new ArrayList<>();

    public void addScoreAll(List<Score> scores) {
        this.scores.clear();
        this.scores.addAll(scores);
    }
}
