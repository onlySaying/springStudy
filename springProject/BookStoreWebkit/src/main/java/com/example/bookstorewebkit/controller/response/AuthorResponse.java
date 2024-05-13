package com.example.bookstorewebkit.controller.response;

import com.example.bookstorewebkit.domain.model.Author;
import lombok.Builder;
import lombok.Data;

public class AuthorResponse {
    @Data
    @Builder
    public static class Detail{
        private Long id;
        private String name;
        public static Detail of(Author author){
            return Detail.builder()
                    .id(author.getId())
                    .name(author.getName())
                    .build();
        }
    }
}
