package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CourseController {
	//courses
	// Course : id, name, author
	
	@RequestMapping("/courses")
	public List<Course> retrievAllCourses()
	{
		return Arrays.asList(
					new Course(1, "Learn Aws", "Yi"),
					new Course(2, "Learn DevOps", "Kim"),
					new Course(3, "Learn Azure", "cho")
				);
	}
}