package com.example.bookstorewebkit.controller.response;

import com.example.bookstorewebkit.domain.model.Publisher;
import lombok.Builder;
import lombok.Data;

public class PublisherResponse {
    @Data
    @Builder
    public static class Detail {
        private Long id;
        private String name;

        public static Detail of(Publisher publisher){
            return Detail.builder()
                    .id(publisher.getId())
                    .name(publisher.getName())
                    .build();
        }
    }
}
