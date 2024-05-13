package com.example.webkitspring.controller.request;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
public class MemberRequest {
    @Data
    @Builder
    public static class MemberRegisterRequest{
        @NotBlank
        @Size(min = 2, max = 4)
        private String name;
        @NotNull
        private Integer grade;
    }

    @Data
    public static class MemberRoomAssignRequest{
        private String roomName;
    }

}
