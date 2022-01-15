package com.times.employeemanagement.exception;

import lombok.ToString;

@ToString(callSuper = true)
public class InvalidSalaryException extends Exception {

	public InvalidSalaryException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	// 2 // parameterized constructor which will accept custom exceptional message
	// override to String method
	
	
	
}
