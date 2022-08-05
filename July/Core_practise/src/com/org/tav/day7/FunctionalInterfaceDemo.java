package com.org.tav.day7;

import java.util.function.Predicate;

public class FunctionalInterfaceDemo {
	public static void getSum(int[] arr, Predicate<Integer> condition)
	{
		int sum=0;
		for(int num:arr) {
			if(condition.test(num)) {
				sum+=num;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr= {1,2,3,4,5,6};
		int evenSum=getSum(intArr,x->x%2==0);
		System.out.println("Sum of even number "+ evenSum);
		System.out.println("SUm of odd number "+ getSum(intArr, x->x%2!=0));

	}

}
