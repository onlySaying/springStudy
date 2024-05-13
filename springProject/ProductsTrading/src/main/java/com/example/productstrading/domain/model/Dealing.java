package com.example.productstrading.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dealing {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate date;
    private int price;
    private String p_name;
    private String sellerId;
    private String buyerId;
    private String trackingNumber;
    private boolean tComplete;
}
