package com.in28minutes.rest.webservice.restfulwebservice.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("v1/person")
	public Person gerFirstVersionOfPerson()
	{
		return new PersonV1("Bob Charlie");
	}
}
