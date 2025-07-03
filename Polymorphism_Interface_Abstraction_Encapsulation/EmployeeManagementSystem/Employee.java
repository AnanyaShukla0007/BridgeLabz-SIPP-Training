package com.EmployeeManagementSystem;

public abstract class Employee {
	private int employeeId;
	private String name;
	private double baseSalary;
	
	public Employee(int employeeId,String name,double baseSalary) {
		this.employeeId=employeeId;
		this.name=name;
		this.baseSalary=baseSalary;
	}
	
	//Abstract Method
	public abstract double calculateSalary();
	
	//Concrete Method
	public void displayDetails() {
		System.out.println("Employee-ID: "+this.employeeId);
		System.out.println("Employee Name: "+this.name);
		System.out.println("BaseSalary: "+this.baseSalary);
	}
	
	//getterMethod
	public int getEmployee() {
		return employeeId;
	}
	public double getbaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double salary) {
		this.baseSalary=salary;
	}
}
