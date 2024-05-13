package com.example.jpapractice.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.SQLUpdate;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class Item extends BaseEntity {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private int price;
}
