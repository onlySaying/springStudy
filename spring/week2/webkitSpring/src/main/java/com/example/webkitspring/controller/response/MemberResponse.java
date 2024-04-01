package com.example.webkitspring.controller.response;

import com.example.webkitspring.domain.model.Member;
import lombok.*;

@Getter
public class MemberResponse {
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @Builder
    public static class RegisterResponse{
        private Long id;
        private String name;
        private int grade;


        public static RegisterResponse of(Member member){
            return RegisterResponse.builder()
                    .id(member.getId())
                    .name(member.getName())
                    .grade(member.getGrade())
                    .build();
        }

    }
}
