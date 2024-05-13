package com.example.jpapractice.controller.reponse;

import com.example.jpapractice.domain.model.Member;
import lombok.Builder;
import lombok.Data;

public class MemberResponse {
    @Data
    @Builder
    public static class Detail{
        private String name;

        public static Detail of(Member member){
            return Detail.builder()
                    .name(member.getName())
                    .build();
        }
    }
}
