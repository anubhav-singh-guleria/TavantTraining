package com.org.tav.day1;

public class StaticTest {
	static int x=20;int y=30;
	
	void display() {
		System.out.println("non static method");
		System.out.println(x);
		System.out.println(y);
	}
	
	static void show() {
		System.out.println("static method");
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest s1=new StaticTest();
		s1.display();
		show();
	}

}
