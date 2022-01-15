package com.times.employeemanagement;

import com.times.employeemanagement.dto.Employee;
import com.times.employeemanagement.exception.InvalidEmpIDException;
import com.times.employeemanagement.exception.InvalidSalaryException;

public class Main4 {

	public static void main(String[] args) {
		
		try {
			Employee employee = new Employee("ab0001", "abhi", "chivate", 123.f, "pune");
			Employee employee2 = new Employee("ab0001", "abhi", "chivate", 123.f, "pune");
			
			System.out.println(employee.hashCode());
			System.out.println(employee2.hashCode());
			System.out.println(employee.equals(employee2));
			
			
		} catch (InvalidEmpIDException | InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
