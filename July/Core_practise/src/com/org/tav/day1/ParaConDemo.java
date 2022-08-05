package com.org.tav.day1;

public class ParaConDemo {
	
	
	public ParaConDemo() {
		System.out.println("zero argument constructor...");
		
	}
	
	public ParaConDemo(int a) {
		System.out.println("One Argument Constructor "+a+" ");
	}
	
	public ParaConDemo(int a,int b) {
		System.out.println("Two Argument Constructor "+a+" "+b+"");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParaConDemo p1=new ParaConDemo();
		 p1=new ParaConDemo(100);
		 p1=new ParaConDemo(200,0);
	}

}
