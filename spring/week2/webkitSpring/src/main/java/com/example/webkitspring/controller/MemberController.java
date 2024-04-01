package com.example.webkitspring.controller;

import com.example.webkitspring.application.MemberAppService;
import com.example.webkitspring.controller.request.MemberRequest;
import com.example.webkitspring.controller.response.ApiResponse;
import com.example.webkitspring.controller.response.MemberResponse;
import com.example.webkitspring.controller.response.ResponseCode;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberAppService memberAppService;

    @PostMapping(value = "/members")
//    @ResponseBody
    public ApiResponse<MemberResponse.RegisterResponse> register(@RequestBody MemberRequest.MemberRegisterRequest request){
        return ApiResponse.response(ResponseCode.Created, memberAppService.register(request));
    }

    @PostMapping(value = "/members/rooms")
//    @ResponseBody
    public ApiResponse<Integer> register(@RequestBody MemberRequest.MemberRoomAssignRequest request){
        return ApiResponse.response(ResponseCode.Created, memberAppService.assignRoom(request));
    }

}
