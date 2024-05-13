package com.example.jpapractice.controller.request;

import lombok.Data;

public class MemberRequest {
    @Data
    public static class Create{
        private String name;
    }
}
