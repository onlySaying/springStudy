package com.example.jpapractice.controller;

import com.example.jpapractice.application.BookAppService;
import com.example.jpapractice.controller.request.BookRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookAppService bookAppService;

    @PostMapping
    public String createBook(@RequestBody BookRequest.CreateBook request){
        return bookAppService.createBook(request);
    }
}
