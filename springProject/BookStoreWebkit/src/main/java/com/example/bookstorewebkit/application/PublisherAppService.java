package com.example.bookstorewebkit.application;

import com.example.bookstorewebkit.controller.response.PublisherResponse;
import com.example.bookstorewebkit.domain.responsity.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PublisherAppService {
    private final PublisherRepository publisherRepository;

    public List<PublisherResponse.Detail> retrieveList(){
        return publisherRepository.findAll().stream()
                .map(PublisherResponse.Detail::of).toList();
    }
}
