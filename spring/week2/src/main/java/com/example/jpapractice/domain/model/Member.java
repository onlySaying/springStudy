package com.example.jpapractice.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member
{
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String city;
    private String street;
    private String zipCode;

    @OneToMany(mappedBy = "member")
    @Builder.Default
    private List<Order> orderList = new ArrayList<>();


}
