package com.times.employeemanagement.dto;

import com.times.employeemanagement.exception.InvalidEmpIDException;
import com.times.employeemanagement.exception.InvalidSalaryException;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true , exclude = "address")
@EqualsAndHashCode

public class Employee implements Comparable<Employee> {

	public Employee(String empId, String empFirstName, String empLastName, float empSalary, String address) 
			throws InvalidEmpIDException, InvalidSalaryException {
		super();
		setEmpId(empId);
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		setEmpSalary(empSalary);
		this.address = address;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) throws InvalidEmpIDException {
		if(empId.equals("") || empId.equals(null)|| empId.length()<6) {
			// throw the exception invalid id exception
			throw new InvalidEmpIDException("id should be provided");
			// y r we providing the object ?
			// y this object is not created by the JVM?
			// JVM is capable to throw RT exceptions which RTEs only those are predefined in java
			// rest we have to throw it.
		}
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) throws InvalidSalaryException {
		if(empSalary==0)
			throw new InvalidSalaryException("salary should not be zero");
		if(empSalary<0) {
			throw new InvalidSalaryException("salary should not be negative");
		}
		this.empSalary = empSalary;
	}

	public String getAddress() {
		return address;
	}

	public String empId;// camel naming convention.
	private String empFirstName;
	private String empLastName;
	private float empSalary;
	@Setter(value = AccessLevel.NONE)
	private String address;
	
	public float calculateSalary() {
		
		return empSalary + empSalary*10/100 + empSalary*5/100 + empSalary*15/100;
		
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empId.compareTo(o.getEmpId());
	}

}
