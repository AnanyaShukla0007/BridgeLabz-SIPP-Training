package com.EmployeeManagementSystem;

public class ParttimeEmployee extends Employee implements Department {
	
	private String Department;
	private int hoursWorked;
	private double rate;
	public ParttimeEmployee(int employeeId, String name, double baseSalary,int hoursWorked,double rate) {
		super(employeeId, name, baseSalary);
		this.hoursWorked=hoursWorked;
		this.rate=rate;
	}



	@Override
	public void assignDepartment(String DepartmentName) {
		this.Department=DepartmentName;
		
	}

	@Override
	public String getDepatmentDetails() {
		return "Part-time: "+this.Department;
	}

	@Override
	public double calculateSalary() {
	
		return getbaseSalary()+(this.hoursWorked*this.rate);
	}
}
