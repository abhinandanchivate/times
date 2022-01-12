package com.times.employeemanagement.repository;

import com.times.employeemanagement.dto.Employee;

public class EmployeeRepository {

	// Do we need to create the array?
	// CN reference[] = new CN[size of the array];
	// Employee employees[] = new Employee[10];
	Employee[] employees = new Employee[10];

	private static int counter = 0;
	// expecting single copy of counter :

	// explicit DC
	private EmployeeRepository() {
		// TODO Auto-generated constructor stub
	}
	
	// we should declare a method called getInstance()
	// this method is used to provide the singleton object
	// this method should be accessible to everyone 
	// can we mark this method as a static method.
	// static method can access only static ref.
	private static EmployeeRepository employeeRepository;
	public static EmployeeRepository getInstance() {
		//
		if(employeeRepository == null) {
			employeeRepository = new EmployeeRepository();
			
		}
		return employeeRepository;
		
	}
	
	public String addEmployee(Employee employee) {
		// index : 0
		// do we need to maintain the last accessible index number ?
		// dynamic req ===> if size is full then it should increase the size
		// automatically

		System.out.println("array length "+ employees.length+"  counter value"+counter);
		if (counter == employees.length) {

			// increase the size
			// we have to create the array with increased size
			Employee[] temp = new Employee[employees.length * 2];
			// copy the old content into new one
			// 1. traditional way ===> using for loop
			// 2. using predefined methods from java

			System.arraycopy(employees, 0, temp, 0, counter);

			employees = temp;

			return "success";
		} else {
			employees[counter++] = employee;
			return "success";
		}

		// return null;

	}

	public String updateEmployee(String empId, Employee employee) {

		// assignment
		return null;

	}

	public Employee getEmployeeById(String empId) {
		
		for (Employee employee : employees) {
			if(employee!=null &&  employee.getEmpId().equals(empId)) {
				return employee;
			}
		}
		return null;
	}

	public Employee[] getEmployees() {
		return employees;
	}
}
