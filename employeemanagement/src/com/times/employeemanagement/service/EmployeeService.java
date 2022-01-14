package com.times.employeemanagement.service;

import java.util.List;

import com.times.employeemanagement.dto.Employee;

public interface EmployeeService {
	
	public String addEmployee(Employee employee);
	public String updateEmployee(String empId, Employee employee);
	public void deleteEmployee(String empId);
	public Employee getEmployeeById(String empId);
	public List<Employee> getEmployees();

}
