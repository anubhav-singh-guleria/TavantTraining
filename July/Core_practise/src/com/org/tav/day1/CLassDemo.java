package com.org.tav.day1;

public class CLassDemo {
	
	//instance variable
	public int year_of_joining ;
	
	public String empName ;
	
	
	//Constructor
	public CLassDemo(int year_of_joining, String empName) {
		super();
		this.year_of_joining = year_of_joining;
		this.empName = empName;
	}
	
	//method

	public void disp() {
		System.out.println("Employee Name : "+empName + " He joined the Org in : "+year_of_joining);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CLassDemo emp1 = new CLassDemo(2022, "Reethik");
		
		System.out.println("hola Everyone!!");
		emp1.disp();

	}

}
