package org.example.application;

import org.example.domain.model.DormName;
import org.example.domain.model.FeePolicy;
import org.example.domain.model.Member;
import org.example.domain.repository.MemberRepository;
import org.example.persistence.MapMemberRepository;

import java.util.Optional;


public class MemberAppService {
    private MemberRepository memberRepository;
    private FeePolicy feePolicy;

    public MemberAppService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public MemberAppService(MemberRepository memberRepository, FeePolicy feePolicy) {
        this.memberRepository = memberRepository;
        this.feePolicy = feePolicy;
    }

    // 멤버를 등록한다.
    public void register(String name, int grade){
        Member member = new Member(name, grade);
        memberRepository.save(member);
    }

    public void setFeePolicy(FeePolicy feePolicy)
    {
        this.feePolicy = feePolicy;
    }
    public int assignRoom(Long memberId, DormName dormName){
        Member member = memberRepository.findById(memberId)
                .orElseThrow(() -> new IllegalArgumentException("해당하는 아이디에 멤버가 존재하지 않습니다."));

        // 멤버에 Room 할당하는 로직
        // OldFeePolicy
        // -> 오름이면 200 리턴, 푸름이면 100리턴

        // NewFeePolicy
        // -> 오름이면 400 리턴, 푸름이면 200리턴

        // 가격 계산 로직
        int fee = feePolicy.calculate(dormName);

        return fee;
    }
}
