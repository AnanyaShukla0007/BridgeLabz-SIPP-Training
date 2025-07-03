package com.EmployeeManagementSystem;

public class Main {
	public static void main(String args[]) {
		Employee emp1=new FulltimeEmployee(101,"Divyansh",1000000.00,5000.00);
		Employee emp2=new ParttimeEmployee(500,"Lucky",250000.00,5,12.5);
		
		((Department)emp1).assignDepartment("IT");
		((Department)emp2).assignDepartment("Sales");
		
		Employee []emp= {emp1,emp2};
		
		for(Employee i:emp) {
			i.displayDetails();
			System.out.println(((Department)i).getDepatmentDetails());
			System.out.println("====================================================================================");
		}
	}
}
