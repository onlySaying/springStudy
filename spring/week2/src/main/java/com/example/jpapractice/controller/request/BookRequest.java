package com.example.jpapractice.controller.request;

import lombok.Data;

public class BookRequest {
    @Data
    public static class CreateBook{
        private String name;
        private int price;
    }
}
