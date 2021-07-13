package com.digite.bank;

public class Customer {
	private int custId;
	private String custName;
	private double creditLimit;
	
	private static int counter;
	
	static {
		System.out.println("Customer class loaded...");
		counter = 101;
	}
	
	public Customer() {
		this("Anonymous", -1);
	}
	public Customer(String custName, double creditLimit) {
		this.custId = counter++;
		this.custName = custName;
		this.creditLimit = creditLimit;
	}

	public void print() {
		System.out.println("ID: " + custId + "\tName: " + custName + 
				" Credit Limit: " + creditLimit);
	}
	
	public static void main(String[] args) {
		// Declaration / Instantiation
		Customer c = new Customer("Bunty", 54000);
		c.print();
		
		Customer c2 = new Customer();
		c2.print();
	}
	
}
