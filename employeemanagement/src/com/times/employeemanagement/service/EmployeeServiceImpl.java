package com.times.employeemanagement.service;

import java.util.List;

import com.times.employeemanagement.dto.Employee;
import com.times.employeemanagement.repository.EmployeeRepository;
import com.times.employeemanagement.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();

	// to add the Employee Object 
	public String addEmployee( Employee employee) {
		return employeeRepository.addEmployee(employee);
		
	}
	
	private EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	// we should declare a method called getInstance()
	// this method is used to provide the singleton object
	// this method should be accessible to everyone 
	// can we mark this method as a static method.
	// static method can access only static ref.
	private static EmployeeServiceImpl employeeService;
	public static EmployeeService getInstance() {
		//
		if(employeeService == null) {
			employeeService= new EmployeeServiceImpl();
			
		}
		return employeeService;
		
	}
	
	public String updateEmployee(String empId, Employee employee) {
		
		return null;
		
	}
	
	
	public Employee getEmployeeById(String empId) {
		return employeeRepository.getEmployeeById(empId);
	}
	
	

	@Override
	public void deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteEmployee(empId);
		
	}

	@Override
	public Employee[] getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployees();
	}
}
