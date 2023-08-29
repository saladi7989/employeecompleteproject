package com.java8Example;

public class Employee {
	
	private int rollNo;
	private String name;
	@Override
	public String toString() {
		return "Employee [rollNo=" + rollNo + ", name=" + name + "]";
	}
	public Employee(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
