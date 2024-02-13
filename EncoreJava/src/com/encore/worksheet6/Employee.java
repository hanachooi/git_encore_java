package com.encore.worksheet6;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Employee {
	
	private String name;
	private String employeeNo;
	private int age;
	
	public void Employee(String name, String employeeNo, int age) {
		this.name = name;
		this.employeeNo = employeeNo;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmployeeNo() {
		return employeeNo;
	}
	
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
