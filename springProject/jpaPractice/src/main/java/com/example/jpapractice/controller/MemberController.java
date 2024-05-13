package com.example.jpapractice.controller;

import com.example.jpapractice.application.MemberAppService;
import com.example.jpapractice.controller.reponse.MemberResponse;
import com.example.jpapractice.controller.request.MemberRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberAppService memberAppService;

    @PostMapping
    public String createMember(@RequestBody MemberRequest.Create request){
        return memberAppService.createMember(request);
    }

    @GetMapping("/{id}")
    public MemberResponse.Detail retrieveDetail(@PathVariable Long id){
        return memberAppService.retrieveMemberDetail(id);
    }
}
