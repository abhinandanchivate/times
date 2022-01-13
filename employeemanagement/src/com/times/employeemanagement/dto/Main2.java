package com.times.employeemanagement.dto;

import com.times.employeemanagement.Manager;

public class Main2 {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		// manager object 
		//
		System.out.println(manager);
		
		
		float empSalary = manager.calculateSalary();
		// visibility of ur method.
		
		System.out.println(empSalary); 
		
		
	}
}
