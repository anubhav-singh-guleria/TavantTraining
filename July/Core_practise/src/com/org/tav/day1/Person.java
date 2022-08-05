package com.org.tav.day1;

public class Person {
	
	String name; int age; String address;
	
	
	Person(){
		//
		name = "Reethik";
		age= 22;
		address="India";
	}
	
	void show() {
		System.out.println("Name : "+name +" Age : "+age +" Address : "+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p =new Person();
		p.show();
	}

}
