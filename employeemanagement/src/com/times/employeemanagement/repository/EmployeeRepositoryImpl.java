package com.times.employeemanagement.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.times.employeemanagement.dto.Employee;

// interface Name : EmployeeRepository
// class Name : EmployeeRepositoryImpl

public class EmployeeRepositoryImpl implements EmployeeRepository {

	// Do we need to create the array?
	// CN reference[] = new CN[size of the array];
	// Employee employees[] = new Employee[10];
//	Employee[] employees = new Employee[10];

	Set<Employee> employees = new TreeSet<>();
	// this list will hold only employee types 
	//List is an interface 
	// interface : we can't create the objects but we can create the reference.
	
	
	private static int counter = 0;
	// expecting single copy of counter :

	// explicit DC
	private EmployeeRepositoryImpl() {
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
			employeeRepository = new EmployeeRepositoryImpl();
			
		}
		return employeeRepository;
		
	}
	
	public String addEmployee(Employee employee) {
		// add the object into the list
	boolean result =	employees.add(employee);
		// add method is used to add the object into the list
	// true : success
	// false : problem / failure situation\
	
	if(result) {
		return "success";
	}
	else 
		return "fail";
		

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

	


	public void deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		this.employees.remove(getEmployeeById(empId));
		
		
	}
//
//	@Override
//	public Employee[] getEmployees() {
//		// TODO Auto-generated method stub
//		return employees;
//	}

	@Override
	public Employee[] getEmployees() {
		// TODO Auto-generated method stub
		
		Employee[] employeesArr = new Employee[employees.size()];
		List<Employee> employees = new ArrayList<>(this.employees);
		// we passed set object to AL ===> Set ===> AL 
		// return employees.toArray(employeesArr);
		for (int i = 0; i < employeesArr.length; i++) {
			employeesArr[i] = employees.get(i); 
		}
		return employeesArr;
	}

	
}
