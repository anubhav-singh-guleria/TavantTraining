package com.org.tav.day4;

public class Student implements Comparable<Student> {
	
	int rollno;
	String name;
	int age;
	
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(age==o.age)
		return 0;
		else if(age>o.age)
			return 1;
		else
			return -1;
	}
	
	
	
}
