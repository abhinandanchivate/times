package com.times.employeemanagement;

import com.times.employeemanagement.dto.Employee;
import com.times.employeemanagement.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService employeeService=EmployeeService.getInstance();

		// we have to create the object
		// ClassName referenceName = new CN();
		// reference : it will refer the object
		// variable : it is capable to hold primitive values (int, float , double ,
		// boolean etc)

		Employee employee = new Employee();
// local ref 
// new : it will give the instruction to create the object @ then RT.
// Type of Object : Employee Type
// Employee() ===> it indicates the Constructor.
// Constructor : is used to initialize the object .
// Type of constructor : DC : default constructor : implicit default Constructor.
// have we used setter method to provide the data?
		// we can use the PC for the same.  ===> 
		employee.setEmpId("AB001");
		employee.setEmpFirstName("abhi");
		employee.setEmpLastName("chivate");
		employee.setEmpSalary(100.0f);
		employee.setAddress("pune");
		
		for(int i = 1;i<=15;i++) {
			employeeService.addEmployee(employee);
		}
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpFirstName());

		Employee employee2 = employeeService.getEmployeeById("AB001");
		System.out.println(employee2!=null);
	}
	
	

}
