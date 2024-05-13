package com.example.jpapractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class JpaPracticeApplicationTests {
    @Autowired
    MovieRepostiory movieRepostiory;
    @Autowired
    AlbumRepository albumRepository;

    @DisplayName("")
    @Test
    @Transactional
    @Rollback(false)
    void test(){
//        Movie movie = Movie.builder()
//                .name("movie")
//                .price(10)
//                .director("kim")
//                .actor("lee")
//                .build();
//
//        movieRepostiory.save(movie);

//
//        Album build = Album.builder()
//                .name("album")
//                .price(1000)
//                .artist("artis")
//                .build();
//
//        albumRepository.save(build);


        //given
//        Book book = Book.builder()
//                .price(100)
//                .name("book")
//                .build();
//
//        bookRepository.save(book);
        //when

        //then
    }

}
