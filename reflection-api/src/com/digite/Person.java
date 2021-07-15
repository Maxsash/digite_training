package com.digite;

import java.security.BasicPermission;

public class Person {

	private String name;
	private int age;
	
	static {
		System.out.println("Person class loaded...");
	}
	public Person() {
		this("Anonymouts", -1);
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void print() {
		SecurityManager mgr = new SecurityManager();
		mgr.checkPermission(new BasicPermission("No trespassing") {	});
		System.out.println("Name: " + name + "\tAge: " + age);
	}
	

	
	
	

}
