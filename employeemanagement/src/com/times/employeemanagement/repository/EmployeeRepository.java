package com.times.employeemanagement.repository;

import java.util.List;

import com.times.employeemanagement.dto.Employee;

public interface EmployeeRepository {

	public String addEmployee(Employee employee);
	public String updateEmployee(String empId, Employee employee);
	public void deleteEmployee(String empId);
	public Employee getEmployeeById(String empId);
	public List<Employee> getEmployees();
}
