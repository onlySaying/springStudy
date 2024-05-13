package com.example.jpapractice.application;

import com.example.jpapractice.controller.reponse.MemberResponse;
import com.example.jpapractice.controller.request.MemberRequest;
import com.example.jpapractice.domain.model.Member;
import com.example.jpapractice.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberAppService {
    private final MemberRepository memberRepository;
    @Transactional
    public String createMember(MemberRequest.Create request) {
        Member member = Member.builder()
                .name(request.getName())
                .build();

        memberRepository.save(member);

        return "생성됨";
    }

    public Member findMemeberById(Long id)
    {
        Member member = memberRepository.findById(id).orElseThrow();
        return member;
    }

    public MemberResponse.Detail retrieveMemberDetail(Long id){
        Member member = memberRepository.findById(id)
                .orElseThrow();

        return MemberResponse.Detail.of(member);
    }
}
