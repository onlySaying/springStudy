package com.example.bookstorewebkit.controller.response;

import com.example.bookstorewebkit.domain.model.Author;
import com.example.bookstorewebkit.domain.model.Book;
import com.example.bookstorewebkit.domain.model.BookType;
import com.example.bookstorewebkit.domain.model.Publisher;
import lombok.Builder;
import lombok.Data;

import java.util.List;

public class BookResponse {

    @Data
    @Builder
    public static class Detail{
        private long id;
        private String title;
        private int price;
        private BookType bookType;
        private List<TagResponse.Detail> tags;
        private PublisherResponse.Detail publisherId;
        private AuthorResponse.Detail authorId;

        public static Detail of(Book book){
            return Detail.builder()
                    .id(book.getId())
                    .title(book.getTitle())
                    .price(book.getPrice())
                    .bookType(book.getBookType())
                    .tags(book.getTags().stream().map(TagResponse.Detail::of).toList())
                    .publisherId(PublisherResponse.Detail.of(book.getPublisherId()))
                    .authorId(AuthorResponse.Detail.of(book.getAuthorID()))
                    .build();
        }
    }
    @Data
    @Builder
    public static class ListElem
    {
        private long id;
        private String title;
        private Author author;

        public static ListElem of(Book book)
        {
            return ListElem.builder()
                    .id(book.getId())
                    .title(book.getTitle())
                    .author(book.getAuthorID())
                    .build();
        }
    }
}
