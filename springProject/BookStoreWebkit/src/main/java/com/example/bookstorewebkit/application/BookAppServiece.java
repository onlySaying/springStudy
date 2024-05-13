package com.example.bookstorewebkit.application;

import com.example.bookstorewebkit.controller.request.BookRequest;
import com.example.bookstorewebkit.controller.request.TagRequest;
import com.example.bookstorewebkit.controller.response.BookResponse;
import com.example.bookstorewebkit.domain.model.*;
import com.example.bookstorewebkit.domain.responsity.AuthorRepository;
import com.example.bookstorewebkit.domain.responsity.BookRespository;
import com.example.bookstorewebkit.domain.responsity.PublisherRepository;
import com.example.bookstorewebkit.domain.responsity.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookAppServiece {
    private final BookRespository bookRespository;
    private final TagRepository tagRepository;
    private final PublisherRepository publisherRepository;
    private final AuthorRepository authorRepository;

    @Transactional
    public BookResponse.Detail createBook(BookRequest.create request)
    {
        Publisher publisher = publisherRepository.findById(request.getPublisherId())
                .orElseThrow();
        Author author = authorRepository.findById(request.getAuthorId())
                .orElseThrow();

        Book book = Book.builder()
                .title(request.getTitle())
                .price(request.getPrice())
                .bookType(request.getType())
                .publisherId(publisher)
                .authorID(author)
                .build();

        bookRespository.save(book);


        return BookResponse.Detail.of(book);
    }

    @Transactional
    public BookResponse.Detail updateStudent(Long id, BookRequest.Update request){
        Book book = bookRespository.findById(id)
                .orElseThrow();

        Publisher publisher = publisherRepository.findById(request.getPublisherId())
                .orElseThrow();
        Author author = authorRepository.findById(request.getAuthorId())
                .orElseThrow();

        book.setTitle(request.getTitle());
        book.setBookType(request.getBookType());
        book.setPrice(request.getPrice());
        book.setAuthorID(author);
        book.setPublisherId(publisher);

        bookRespository.save(book);

        return BookResponse.Detail.of(book);
    }


    @Transactional
    public Tag addTag(TagRequest.create request, Book book){

        Tag tag =Tag.builder()
                .name(request.getName())
                .book(book)
                .build();

            tagRepository.save(tag);
        return tag;
    }

    public BookResponse.Detail retrieveDetail(Long id) {
        Book book = bookRespository.findById(id)
                .orElseThrow();
        return BookResponse.Detail.of(book);
    }

    public Book findBook(Long id)
    {
        Book book = bookRespository.findById(id)
                .orElseThrow();
        return book;
    }

    public List<BookResponse.ListElem> retireveList() {
        return bookRespository.findAll().stream()
                .map(BookResponse.ListElem::of)
                .toList();
    }

    @Transactional
    public void deleteList(Long id)
    {
        Book book = findBook(id);
        bookRespository.delete(book);
    }
}
