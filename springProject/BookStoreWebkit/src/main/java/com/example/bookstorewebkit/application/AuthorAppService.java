package com.example.bookstorewebkit.application;

import com.example.bookstorewebkit.controller.response.AuthorResponse;
import com.example.bookstorewebkit.domain.responsity.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorAppService {
    private final AuthorRepository authorRepository;

    public List<AuthorResponse.Detail> retrieveList(){
        return authorRepository.findAll().stream().map(AuthorResponse.Detail::of).toList();
    }
}
