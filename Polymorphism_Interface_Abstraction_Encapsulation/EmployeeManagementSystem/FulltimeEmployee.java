package com.EmployeeManagementSystem;

 class FulltimeEmployee extends Employee implements Department{
 	private String Department;
 	private double bonus;
	public FulltimeEmployee(int employeeId, String name, double baseSalary,double bonus) {
		super(employeeId, name, baseSalary);
		this.bonus=bonus;
	}

	@Override
	public void assignDepartment(String DepartmentName) {
		this.Department=DepartmentName;
		
	}

	@Override
	public String getDepatmentDetails() {
		return "Full-time-Department "+this.Department;
	}

	@Override
	public double calculateSalary() {
		
		return getbaseSalary()+bonus;
	}
 }