package com.example.bookstorewebkit.controller;

import com.example.bookstorewebkit.application.BookAppServiece;
import com.example.bookstorewebkit.controller.request.BookRequest;
import com.example.bookstorewebkit.controller.request.TagRequest;
import com.example.bookstorewebkit.controller.response.BookResponse;
import com.example.bookstorewebkit.domain.model.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookAppServiece bookAppServiece;

    @PostMapping
    public BookResponse.Detail create(@RequestBody BookRequest.create request)
    {
        return bookAppServiece.createBook(request);
    }

    @PutMapping("/{id}")
    public BookResponse.Detail updateStudent
            (@PathVariable Long id, @RequestBody BookRequest.Update request)
    {
        return bookAppServiece.updateStudent(id, request);
    }

    @GetMapping("/{id}")
    public BookResponse.Detail retrieveDetail(@PathVariable Long id)
    {
        return bookAppServiece.retrieveDetail(id);
    }

    @PostMapping("/{id}")
    public Tag addTag(@PathVariable Long id, @RequestBody TagRequest.create request)
    {
        return bookAppServiece.addTag(request, bookAppServiece.findBook(id));
    }

    @GetMapping
    public List<BookResponse.ListElem> retrieveDetail()
    {
        return bookAppServiece.retireveList();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id)
    {
        bookAppServiece.deleteList(id);
        return "delete";
    }
}
