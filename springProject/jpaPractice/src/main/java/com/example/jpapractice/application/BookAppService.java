package com.example.jpapractice.application;

import com.example.jpapractice.controller.request.BookRequest;
import com.example.jpapractice.domain.model.Book;
import com.example.jpapractice.domain.model.Member;
import com.example.jpapractice.domain.model.Team;
import com.example.jpapractice.domain.repository.BookRepository;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BookAppService {
    final MemberAppService memberAppService;
    final BookRepository bookRepository;
    public String createBook(BookRequest.CreateBook request) {

        Book book = Book.builder().
                name(request.getName()).
                price(request.getPrice()).
                createdAt(LocalDateTime.now()).
                bookType(request.getBookType()).
                owner(memberAppService.findMemeberById(request.getMemberId()))
                .build();

        bookRepository.save(book);
        return "생성됨";
    }
}
