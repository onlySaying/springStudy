package com.example.productstrading.controller.request;

import lombok.Data;

import java.time.LocalDate;

public class ProductRequest {

    @Data
    public static class create{
        private LocalDate date;
        private int price;
        private String p_name;
        private String user;
        private String p_contents;
    }

    @Data
    public static class update
    {
        private int price;
        private String p_name;
        private String p_contents;
    }
}
