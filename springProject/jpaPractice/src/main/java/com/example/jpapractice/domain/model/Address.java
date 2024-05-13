package com.example.jpapractice.domain.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    private String city;
    private String street;

//    public static Address of(String city, String street, String zipcode){
//        if(city.length()>10){
//            throw new IllegalArgumentException();
//        }
//
//        return Address.builder()
//                .city(city)
//                .street(street)
//                .zipcode(zipcode)
//                .build();
//    }
}
