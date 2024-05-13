package com.example.productstrading.controller.request;

import lombok.Data;

import java.time.LocalDate;

public class SellingRequest {

    @Data
    public static class create
    {
        private LocalDate date;
        private int price;
        private String p_name;
    }
}
