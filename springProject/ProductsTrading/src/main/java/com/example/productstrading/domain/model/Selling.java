package com.example.productstrading.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Selling {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate date;
    private int price;
    private String p_name;
}
