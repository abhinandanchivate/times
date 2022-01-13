package com.times.employeemanagement.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true , exclude = "address")
@Setter
@Getter
@AllArgsConstructor
public class Employee {

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

}
