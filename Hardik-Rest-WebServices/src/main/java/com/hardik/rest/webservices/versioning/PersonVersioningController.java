package com.hardik.rest.webservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

	
	
	@GetMapping("v1/person")
	public Person1 person1() {
		return new Person1("Hardik Maheshwari");
	}
	
	@GetMapping("v2/person")
	public Person2 person2() {
		return new Person2(new Name("Hardik", "Maheshwari"));
	}
	
	@GetMapping(value="person/params", params = "version=1")
	public Person1 param1() {
		return new Person1("Hardik Maheshwari");
	}
	
	@GetMapping(value="person/params", params = "version=2")
	public Person2 param2() {
		return new Person2(new Name("Hardik", "Maheshwari"));
	}
	
	@GetMapping(value="person/header", headers = "X_API_Version=1")
	public Person1 header1() {
		return new Person1("Hardik Maheshwari");
	}
	
	@GetMapping(value="person/header", headers = "X_API_Version=2")
	public Person2 header2() {
		return new Person2(new Name("Hardik", "Maheshwari"));
	}
	
	@GetMapping(value="person/produces", produces = "application/vnd.company.app-v1+json")
	public Person1 produces1() {
		return new Person1("Hardik Maheshwari");
	}
	
	@GetMapping(value="person/produces", headers = "application/vnd.company.app-v2+json")
	public Person2 produces2() {
		return new Person2(new Name("Hardik", "Maheshwari"));
	}
	
}
