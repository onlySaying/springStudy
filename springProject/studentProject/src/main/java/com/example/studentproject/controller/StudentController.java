package com.example.studentproject.controller;

import com.example.studentproject.application.StudentAppService;
import com.example.studentproject.controller.request.StudentRequest;
import com.example.studentproject.controller.response.StudentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentAppService studentAppService;

    @PostMapping
    public StudentResponse.Detail createStudent(@RequestBody StudentRequest.Create request){
        return studentAppService.createStudent(request);
    }

    @PutMapping("/{id}")
    public StudentResponse.Detail updateStudent(@PathVariable Long id, @RequestBody StudentRequest.Update request){
        return studentAppService.updateStudent(id, request);
    }

    @GetMapping("/{id}")
    public StudentResponse.Detail retrieveDetail(Long id){
        return studentAppService.retrieveDetail(id);
    }

    @GetMapping
    public List<StudentResponse.ListElem> retrieveDetail(){
        return studentAppService.retireveList();
    }

}
