package com.org.tav.day1;

public class Student {

	//write 3 instance variable stud name,standard and marks
	
	public String name;
	public int age;
	public String address;
	String SchoolName; String Section;
	
	public Student(String name,int age,String address) {
		System.out.println("First manner constr call...");
		this.name=name;
		this.age=age;
		this.address=address;
		
	}
	void show() {
		System.out.println("Name : "+name +" Age : "+age +" Address : "+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student("a", 12,"BB");
		Student s2= new Student("b", 12,"BB");
		Student s3= new Student("c", 12,"BB");
		Student s4= new Student("d", 12,"BB");
		Student s5= new Student("e", 12,"BB");
		s.show();
		s2.show();
		s3.show();
		s4.show();
		s5.show();
	}

}
