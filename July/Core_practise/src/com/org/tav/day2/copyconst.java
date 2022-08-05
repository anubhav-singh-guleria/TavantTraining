package com.org.tav.day2;

public class copyconst {
	
	int x=10; int y=20;
	
	

	public copyconst() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	copyconst(copyconst n){
		x=n.x;
		y=n.y;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyconst n=new copyconst();
		System.out.println("Value of X "+n.x);
		System.out.println("Value of Y "+n.y);
		
		n.x=50;n.y=40;
		System.out.println("Updated value");
		System.out.println("Value of X "+n.x);
		System.out.println("Value of Y "+n.y);//50 40
		
		copyconst n2=new copyconst();
		System.out.println("Not getting Updated value of a and b in new obj");
		System.out.println("Value of X "+n2.x);
		System.out.println("Value of Y "+n2.y);//
		
		copyconst n3=new copyconst(n);//passing the reference
		System.out.println(" Getting Updated value of a and b in new obj");
		System.out.println("Value of X "+n3.x);
		System.out.println("Value of Y "+n3.y);
	}

}
