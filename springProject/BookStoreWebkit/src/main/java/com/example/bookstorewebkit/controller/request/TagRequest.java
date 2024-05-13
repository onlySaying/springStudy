package com.example.bookstorewebkit.controller.request;

import lombok.Data;

public class TagRequest {

    @Data
    public static class create
    {
        private String name;
    }
}
