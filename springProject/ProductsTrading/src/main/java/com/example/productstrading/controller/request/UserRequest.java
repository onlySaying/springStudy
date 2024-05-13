package com.example.productstrading.controller.request;

import lombok.Data;

public class UserRequest {

    @Data
    public static class create
    {
        String userId;
        String password;
        String name;
        String address;
    }

    @Data
    public static class update
    {
        String password;
        String name;
        String address;
    }

    @Data
    public static class login
    {
        String userId;
        String password;
    }
}
