package com.example.studentproject.controller;

import com.example.studentproject.application.StudentAppService;
import com.example.studentproject.controller.request.StudentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentAppService studentAppService;

    @PostMapping
    public String createStudent(@RequestBody StudentRequest.createStudent request)
    {
        return studentAppService.createStudent(request);
    }
}
