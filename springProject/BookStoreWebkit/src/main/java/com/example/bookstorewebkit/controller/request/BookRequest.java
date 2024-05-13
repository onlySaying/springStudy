package com.example.bookstorewebkit.controller.request;

import com.example.bookstorewebkit.domain.model.BookType;
import lombok.Data;

import java.util.List;


public class BookRequest {

    @Data
    public static class create
    {
        private String title;
        private int price;
        private BookType Type;
        private List<TagRequest.create> tags;
        private Long publisherId;
        private Long authorId;
    }

    @Data
    public static class Update
    {
        private String title;
        private int price;
        private BookType bookType;
        private List<TagRequest.create> tags;
        private Long publisherId;
        private Long authorId;
    }
}
