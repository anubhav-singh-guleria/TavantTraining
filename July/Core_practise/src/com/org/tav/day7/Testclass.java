package com.org.tav.day7;

public class Testclass implements Test1,Test2{
	
	static void print() {
		System.out.println("Printing test class");
	}
	
	public static void main(String[] args) {
		Testclass tc= new Testclass();
		print();
		
		tc.hello1();
		tc.hello2();
		
		tc.show();
	}
	@Override
	private void show() {
		// TODO Auto-generated method stub
		
	}

	private void hello2() {
		// TODO Auto-generated method stub
		
	}

	private void hello1() {
		// TODO Auto-generated method stub
		
	}

}
