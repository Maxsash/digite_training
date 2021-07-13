package com.digite.org;

public abstract class Employee {
	private int empNo;
	private String empName;
	private double salary;
	
	private static int counter;
	
	static {  //Static initialiser block executes at class loading,
				// acts as constructor for static member
		System.out.println("Employee class loaded..");
		counter = 101;
	}
	
	public Employee() {
		this("Anonymous", -1);
	}
	public Employee(String empName, double salary) {
		super();
		this.empNo = counter++;
		this.empName = empName;
		this.salary = salary;
	}

	public void paySlip() {
		System.out.println("ID: " + empNo 
				+ "\nName: " + empName
				+ "\nSalary: " + salary);
	}
	
	public double getSalary() {
//		System.out.println(empName + "'s  salary is " + salary);
		return salary;
	}
	
}