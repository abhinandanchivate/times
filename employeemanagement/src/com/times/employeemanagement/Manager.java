package com.times.employeemanagement;

import com.times.employeemanagement.dto.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@Setter
@Getter

public class Manager extends Employee {
// Employee : Parent : 
// Manager : Child
	
	public Manager() {
		// TODO Auto-generated constructor stub
		// we have to use the PC from the super class to initialize the fields
		// we have to use super method
		// super method is used for calling the base class constructor.
		// it should be the 1st call.
		
		super("ab001","abhi","chivate",1000.0f,"pune");
		System.out.println("hello");
		System.out.println(super.calculateSalary());
		this.projectAllow= 700.0f;
		
	}
	
	public Manager(String empId, String empFirstName, String empLastName, float empSalary, String address,
		String projectName, int projectId, float projectAllow) {
	super(empId, empFirstName, empLastName, empSalary, address);
	this.projectName = projectName;
	this.projectId = projectId;
	this.projectAllow = projectAllow;
}

	public Manager(
			String projectName, int projectId, float projectAllow) {
		this();  // this method is used to call the constructor from the same class.
		// constructor chaining.
		
		//super(empId, empFirstName, empLastName, empSalary, address);
		this.projectName = projectName;
		this.projectId = projectId;
		this.projectAllow = projectAllow;
		
	}

	private String projectName;
	
	private int projectId;
	private float projectAllow;
	
	@Override  // override the calculate the salary method : since manager should get basic salary + hra + ta + da + PA
	public float calculateSalary() {
			// TODO Auto-generated method stub
			return super.calculateSalary() + this.projectAllow;
		}
	
	
}
