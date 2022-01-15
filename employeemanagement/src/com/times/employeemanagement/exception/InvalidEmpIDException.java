package com.times.employeemanagement.exception;

import lombok.ToString;

@ToString(callSuper = true)
public class InvalidEmpIDException extends Exception {
	
	public InvalidEmpIDException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	

}
