package com.org.tav.day4;


import java.util.Arrays;

public class UseOfComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] st=new Student[3];
		st[0]=new Student(101, "Harry", 12);
		st[1]=new Student(102, "Carl", 18);
		st[2]=new Student(103, "Tony", 10);
		
		Arrays.sort(st);
		
		for(Student s:st)
			System.out.println("Name "+s.name + "Rollno :"+s.rollno+ "Age: "+s.age);
	}

}
