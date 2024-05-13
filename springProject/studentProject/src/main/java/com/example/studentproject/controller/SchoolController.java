package com.example.studentproject.controller;

import com.example.studentproject.application.SchoolAppService;
import com.example.studentproject.controller.response.SchoolResponse;
import com.example.studentproject.domain.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/schools")
public class SchoolController {
    private final SchoolAppService schoolAppService;

    @GetMapping
    public List<SchoolResponse.Detail> retrieveList(){
        return schoolAppService.retrieveList();
    }

}
