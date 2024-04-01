package com.example.webkitspring.controller.request;

import lombok.*;

@Data
public class MemberRequest {
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @Data
    public static class MemberRegisterRequest{
        private String name;
        private int grade;
    }

    @Data
    public static class MemberRoomAssignRequest{
        private Long memberId;
        private String roomName;
    }

}
