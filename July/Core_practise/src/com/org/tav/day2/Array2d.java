package com.org.tav.day2;

import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"Harsha","Shivesh","SHivam"};
		int[][] marks=new int[3][5];
		
		int[][] marks=new int[3][5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("enter the marks");
			for(int j=0;j<5;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			int sum=0;
			for(int j=0;j<5;j++)
			{
				sum=sum+marks[i][j];
			}
		}
		
		}

	}


