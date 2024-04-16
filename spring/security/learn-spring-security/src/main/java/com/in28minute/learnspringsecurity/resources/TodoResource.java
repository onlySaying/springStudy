package com.in28minute.learnspringsecurity.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	List<Todo> TODOS_LIST = List.of(new Todo("yi", "Learn"),
			new Todo("yi", "Aws"));

	@GetMapping("/todos")
	public List<Todo> retrieveAllTodos()
	{		
		return TODOS_LIST;
	}
	
	@PostMapping("/todos")
	public String sample()
	{
		return "sample";
	}
	
	@GetMapping("/users/{username}/todos")
	public Todo retrieveTodosForSpecificUser
	(@PathVariable("username") String username)
	{
		return TODOS_LIST.get(0);
	}
	
	@PostMapping("/users/{username}/todos")
	public void CreateTodosForSpecificUser
	(@PathVariable("username") String username, 
			@RequestBody Todo todo)
	{
		System.out.println("ddd");
		logger.info("Create {} for {}", todo , username);
	}
}

record Todo (String username, String description) {}