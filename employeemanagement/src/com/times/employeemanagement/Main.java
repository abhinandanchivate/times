package com.times.employeemanagement;

import java.util.Scanner;

import com.times.employeemanagement.dto.Employee;
import com.times.employeemanagement.exception.InvalidEmpIDException;
import com.times.employeemanagement.exception.InvalidSalaryException;
import com.times.employeemanagement.service.EmployeeService;
import com.times.employeemanagement.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService employeeService=EmployeeServiceImpl.getInstance();

		// we have to create the object
		// ClassName referenceName = new CN();
		// reference : it will refer the object
		// variable : it is capable to hold primitive values (int, float , double ,
		// boolean etc)

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter hte empid");
		String empId= scanner.next();
		System.out.println("enter the first Name");
		String firstName = scanner.next();
		System.out.println("enter the last name");
		String lastName = scanner.next();
		System.out.println("enter the address");
		String address=scanner.next();
		System.out.println("enter the salary");
		float empSalary = scanner.nextFloat();
		Employee employee = null;
		try {
			employee = new Employee(empId, firstName, 
					lastName, empSalary, address);
			
			System.out.println(employee);
		} catch (InvalidEmpIDException | InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String result = employeeService.addEmployee(employee);
		try {
			employeeService.addEmployee(new Employee("AB0001", firstName, 
						lastName, empSalary, address));
		} catch (InvalidEmpIDException | InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Employee employee2 = employeeService.getEmployeeById("AB0001");
		System.out.println(employee2);
		System.out.println(result);
		
		for (Employee employee3 : employeeService.getEmployees()) {
			System.out.println(employee3);
			
			
			
			
			
			
		}
		employeeService.deleteEmployee("AB0001");
		System.out.println(employeeService.getEmployees().length);
		
		
		// local ref 
// new : it will give the instruction to create the object @ then RT.
// Type of Object : Employee Type
// Employee() ===> it indicates the Constructor.
// Constructor : is used to initialize the object .
// Type of constructor : DC : default constructor : implicit default Constructor.
// have we used setter method to provide the data?
		// we can use the PC for the same.  ===> 
//		employee.setEmpId("AB001");
//		employee.setEmpFirstName("abhi");
//		employee.setEmpLastName("chivate");
//		employee.setEmpSalary(100.0f);
//		employee.setAddress("pune");
//		
//		for(int i = 1;i<=15;i++) {
//			employeeService.addEmployee(employee);
//		}
//		
//		System.out.println(employee.getEmpId());
//		System.out.println(employee.getEmpFirstName());
//
//		Employee employee2 = employeeService.getEmployeeById("AB001");
//		System.out.println(employee2!=null);
	}
	
	

}
