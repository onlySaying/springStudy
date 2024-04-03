package com.example.jpapractice.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Member member;
    LocalDate localDate;
    OrderStatus status;
}
