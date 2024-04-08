package com.in28minutes.rest.webservice.restfulwebservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservice.restfulwebservice.user.Post;


public interface PostRepository extends JpaRepository<Post, Integer>{

}
