package com.example.studentproject.application;

import com.example.studentproject.controller.response.SchoolResponse;
import com.example.studentproject.domain.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolAppService {
    private final SchoolRepository schoolRepository;

    public List<SchoolResponse.Detail> retrieveList(){
        return schoolRepository.findAll().stream().map(SchoolResponse.Detail::of).toList();
    }
}
