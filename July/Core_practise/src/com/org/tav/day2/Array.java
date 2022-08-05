package com.org.tav.day2;

import java.util.Scanner;

public class Array
{
public static void main(String[] args)
{
int n, year,max;
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of emplyee:");
n = s.nextInt();
int a[] = new int[n];
System.out.println("Enter the year of experience");
for(int i = 0; i < n; i++)
{
a[i] = s.nextInt();
}
max = a[0];
for(int i = 0; i < n; i++)
{
if(max < a[i])
{
max = a[i];
}
}
System.out.println("Maximum value in the array is:"+max);
}
}