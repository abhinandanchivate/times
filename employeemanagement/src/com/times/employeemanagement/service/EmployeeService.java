package com.times.employeemanagement.service;

import com.times.employeemanagement.dto.Employee;
import com.times.employeemanagement.repository.EmployeeRepository;

public class EmployeeService {
	
	private EmployeeRepository employeeRepository = EmployeeRepository.getInstance();

	// to add the Employee Object 
	public String addEmployee( Employee employee) {
		return employeeRepository.addEmployee(employee);
		
	}
	
	private EmployeeService() {
		// TODO Auto-generated constructor stub
	}
	
	// we should declare a method called getInstance()
	// this method is used to provide the singleton object
	// this method should be accessible to everyone 
	// can we mark this method as a static method.
	// static method can access only static ref.
	private static EmployeeService employeeService;
	public static EmployeeService getInstance() {
		//
		if(employeeService == null) {
			employeeService= new EmployeeService();
			
		}
		return employeeService;
		
	}
	
	public String updateEmployee(String empId, Employee employee) {
		
		return null;
		
	}
	
	
	public Employee getEmployeeById(String empId) {
		return employeeRepository.getEmployeeById(empId);
	}
	
	public Employee[] getEmployees() {
		return employeeRepository.getEmployees();
	}
}
