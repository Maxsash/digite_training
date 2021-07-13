package com.digite.org;
public class Executive extends Employee {
	private double incentive;

	public Executive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Executive(String empName, double salary, double incentive) {
		// calls parameterized constructor of super class with matching 
		// signature 
		super(empName, salary);
		this.incentive = incentive;
	}

	// Overriding methods of super class Employee
	@Override
	public void paySlip() {
		// TODO Auto-generated method stub
		super.paySlip(); //calls the super class' payslip implementation
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + incentive;
	}
	
}
