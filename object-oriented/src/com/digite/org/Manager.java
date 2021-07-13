package com.digite.org;
public class Manager extends Employee {
	private double commission;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String empName, double salary, double commission) {
		// calls parameterized constructor of super class with matching 
		// signature 
		super(empName, salary);
		this.commission = commission;
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
		return super.getSalary() + commission;
	}
	
	
	

}
