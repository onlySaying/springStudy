package com.example.bookstorewebkit.controller.response;

import com.example.bookstorewebkit.domain.model.Tag;
import lombok.Builder;
import lombok.Data;

public class TagResponse {
    @Data
    @Builder
    public static class Detail {
        private Long id;
        private String name;

        public static Detail of(Tag tag){
            return Detail.builder()
                    .id(tag.getId())
                    .name(tag.getName())
                    .build();
        }
    }
}
