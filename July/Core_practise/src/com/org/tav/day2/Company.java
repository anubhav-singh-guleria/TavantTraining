package com.org.tav.day2;


import java.util.*;
import java.lang.*;

class Company{


static int computeSalary(int basic,
						char grade)
{
	double allowance;
	double hra, da, pf;
	
	hra = 0.2 * basic;
	da = 0.5 * basic;
	pf = 0.11 * basic;
	

	if (grade == 'A')
	{
		allowance = 1700.0;
	}
	else if (grade == 'B')
	{
		allowance = 1500.0;
	}
	else
	{
		allowance = 1300.0;
	}
	double gross;
	

	gross = Math.round(basic + hra + da +
						allowance - pf);
						
	return (int)gross;
}


public static void main (String[] args)
{
	int basic;
	char grade = 'A';
	String hr,service,testing;
	String useri;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the employee Dept whose Salary are you are interested in");
	useri=sc.next();
	
	if(useri.equals("hr"))
	{
		System.out.println(computeSalary(1000, grade));
	}
	else if (useri.equals("services"))
	{
		System.out.println(computeSalary(2000, grade));
	}else if(useri.equals("testing"))
	{
		System.out.println(computeSalary(1500, grade));
	}
	else
		System.out.println("Please enter the correct department");
	
	
	
}
}

