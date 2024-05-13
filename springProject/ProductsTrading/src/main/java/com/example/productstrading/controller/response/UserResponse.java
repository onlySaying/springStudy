package com.example.productstrading.controller.response;

import com.example.productstrading.domain.model.UserContext;
import lombok.Builder;
import lombok.Data;

public class UserResponse {

    @Data
    @Builder
    public static class Detail
    {
        private Long id;
        private String userId;
        String password;
        String name;
        String address;
        public static Detail of(UserContext user)
        {
            return Detail.builder()
                    .userId(user.getUserId())
                    .password(user.getPassword())
                    .name(user.getName())
                    .address(user.getAddress())
                    .build();
        }
    }
}
