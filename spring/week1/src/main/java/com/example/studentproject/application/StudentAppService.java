package com.example.studentproject.application;

import com.example.studentproject.controller.request.ScoresRequest;
import com.example.studentproject.domain.model.Scores;
import com.example.studentproject.domain.model.Student;
import com.example.studentproject.domain.responsity.StudentResposity;
import com.example.studentproject.controller.request.StudentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentAppService {
    private final StudentResposity studentResposity;
    private final ScoreAppService scoreAppService;
    @Transactional
    public String createStudent(StudentRequest.createStudent request)
    {
        List<Scores> scores = new ArrayList<>();
        for(ScoresRequest.createStudent req : request.getScores()){
            scores.add(scoreAppService.createScore(req));
        }
        studentResposity.
        Student student = Student.builder().
                name(request.getName()).
                grade(request.getGrade()).
                schoolNum(request.getSchoolNum()).
                scores(scores).build();
        studentResposity.save(student);
        return "생성됨";
    }
}
