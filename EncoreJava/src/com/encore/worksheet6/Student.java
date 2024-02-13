package com.encore.worksheet6;

public class Student extends Employee{
	
	private int oracle;
	private int java;
	private int servlet;
	
	// 자식 생성자를 만들 때, 부모 생성자를 호출해야 한다. 
	
	public Student(int oracle, int java, int servlet) {
		super();
		this.oracle = oracle;
		this.java = java;
		this.servlet = servlet;
	}
	
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getServlet() {
		return servlet;
	}
	public void setServlet(int servlet) {
		this.servlet = servlet;
	}
	
}
