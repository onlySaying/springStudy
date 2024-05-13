package org.example;

import org.example.application.MemberAppService;
import org.example.domain.model.DormName;
import org.example.persistence.MapMemberRepository;
import org.example.domain.model.OldFeePolicy;

public class Main {
    public static void main(String[] args) {
        MapMemberRepository mapMemberRepository = new MapMemberRepository();

        MemberAppService memberAppService = new MemberAppService(mapMemberRepository);

        memberAppService.register("kim", 1);
        memberAppService.setFeePolicy(new OldFeePolicy());
        int fee = memberAppService.assignRoom(1L, DormName.OREUM);
        System.out.println("fee = " + fee);
    }
}