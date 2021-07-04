package com.hardik.rest.webservices.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date timestamp;
	private String message;
	private String details;
	
	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.details = details;
		this.timestamp = timestamp;
		this.message = message;
			
	}

	public Date getTimestamp() {
		return timestamp;
	}

	

	public String getMessage() {
		return message;
	}


	public String getDetails() {
		return details;
	}

	
	
	
	
}
