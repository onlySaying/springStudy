package com.example.productstrading.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserContext {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String userId;
    private String password;
    private String name;
    private String address;

}
