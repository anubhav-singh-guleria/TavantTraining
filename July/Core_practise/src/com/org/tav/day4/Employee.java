package com.org.tav.day4;

public class Employee implements Comparable<Employee> {
	
	private String name;
	
	private double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	
	
	public void hikeSalary(double byPercent) {
		double hike=salary* byPercent/100;
		salary+=hike;
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
