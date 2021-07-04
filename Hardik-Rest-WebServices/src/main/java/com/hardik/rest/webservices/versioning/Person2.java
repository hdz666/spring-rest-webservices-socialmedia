package com.hardik.rest.webservices.versioning;

public class Person2 {
	
	private Name name;

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Person2(Name name) {
		super();
		this.name = name;
	}
	
	
	public Person2() {
		super();
	}

}
