package com.example.studentproject.application;

import com.example.studentproject.controller.request.ScoresRequest;
import com.example.studentproject.controller.request.StudentRequest;
import com.example.studentproject.domain.model.Scores;
import com.example.studentproject.domain.responsity.ScoresResposity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScoreAppService {
    private final ScoresResposity scoresResposity;
    public Scores createScore(ScoresRequest.createStudent request)
    {
        Scores scores = Scores.builder().
                semester(request.getSemester()).
                score(request.getScore())
                .build();
         return scoresResposity.save(scores);
    }
}
