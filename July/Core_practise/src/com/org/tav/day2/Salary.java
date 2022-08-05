package com.org.tav.day2;

import java.util.Scanner;
import java.util.Arrays; 

public class Salary {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,salary;
		System.out.println("Enter the number of employee");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Salary of employee "+i);
			a[i]=s.nextInt();
			
			if(a[i]>50000 && a[i]<100000) {
			//	System.out.println("Your hike is 20% and new salary is ");
			System.out.println("Your hike is 20%  ");
			int newsal=a[i]+(a[i]*20/100);
			a[i]=newsal;
			System.out.println("And new Salary is "+newsal);
			}
			else if(a[i]>100000 && a[i]<500000) {
				System.out.println("Your hike is 25%");
				int newsal=a[i]+(a[i]*20/100);
				a[i]=newsal;
				System.out.println("And new Salary is "+newsal);
			}
			else if(a[i]>500000 && a[i]<1000000) {
			System.out.println("Your hike is 28%");
			int newsal=a[i]+(a[i]*20/100);
			a[i]=newsal;
			System.out.println("And new Salary is "+newsal);
			}
			else
				System.out.println("No hike for you");
			
		}
		
		
		
		
		
		

	}

}
