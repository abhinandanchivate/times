package com.times.employeemanagement;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import com.times.employeemanagement.dto.Employee;
import com.times.employeemanagement.exception.InvalidEmpIDException;
import com.times.employeemanagement.exception.InvalidSalaryException;

interface I {
	default void display() {
		System.out.println("hello from I");
	}
}

interface I2 {
	default void display() {
		System.out.println("hello from I");
	}
}

class Demo implements I, I2 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		I.super.display();
	}
	
}
public class Main5 {

	public static void main(String[] args) {
		
		TreeMap<Employee, String> map = new TreeMap<>();
		
		try {
			map.put(new Employee("ZE0001", "Zen", "ZEN", 1234, "pune"), "emp1");
			map.put(new Employee("AB0001", "abhi", "chivate", 1234, null), "emp2");
			System.out.println(map);
		} catch (InvalidEmpIDException | InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
