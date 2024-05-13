package com.example.studentproject.application;

import com.example.studentproject.controller.request.ScoreRequest;
import com.example.studentproject.controller.request.StudentRequest;
import com.example.studentproject.controller.response.StudentResponse;
import com.example.studentproject.domain.model.School;
import com.example.studentproject.domain.model.Score;
import com.example.studentproject.domain.model.Student;
import com.example.studentproject.domain.repository.SchoolRepository;
import com.example.studentproject.domain.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentAppService {
    private final StudentRepository studentRepository;
    private final SchoolRepository schoolRepository;

    @Transactional
    public StudentResponse.Detail createStudent(StudentRequest.Create request){
        School school = schoolRepository.findById(request.getSchoolId())
                .orElseThrow();

        if(studentRepository.existsByName(request.getName()) || studentRepository.existsBySchoolNum(request.getSchoolNum())){
            throw new IllegalArgumentException();
        }

        Student student = Student.builder()
                .name(request.getName())
                .grade(request.getGrade())
                .schoolNum(request.getSchoolNum())
                .school(school)
                .build();


        List<Score> scores = createScore(request.getScores(), student);

        student.addScoreAll(scores);
        studentRepository.save(student);


        return StudentResponse.Detail.of(student);
    }

    @Transactional
    public StudentResponse.Detail updateStudent(Long id, StudentRequest.Update request){
        Student student = studentRepository.findById(id)
                .orElseThrow();

        School school = schoolRepository.findById(request.getSchoolId())
                .orElseThrow();

        student.setGrade(request.getGrade());
        student.setSchool(school);

        List<Score> scores = createScore(request.getScores(), student);

        student.addScoreAll(scores);

        studentRepository.save(student);

        return StudentResponse.Detail.of(student);
    }

    private List<Score> createScore(List<ScoreRequest.Create> request, Student student){
        List<Score> scores = new ArrayList<>();

        for(ScoreRequest.Create scRequest : request){
            Score score = Score.builder()
                    .semester(scRequest.getSemester())
                    .score(scRequest.getScore())
                    .owner(student)
                    .build();

            scores.add(score);
        }

        return scores;
    }

    public StudentResponse.Detail retrieveDetail(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow();
        return StudentResponse.Detail.of(student);
    }

    public List<StudentResponse.ListElem> retireveList() {
        return studentRepository.findAll().stream()
                .map(StudentResponse.ListElem::of)
                .toList();
    }
}
