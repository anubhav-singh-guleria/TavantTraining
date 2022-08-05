package com.org.tav.day3;

import java.util.LinkedList;

public class LinklistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list=new LinkedList<>();
		list.add("Mumbai");list.add("Delhi");
		list.add("Bhopal");list.add("Pune");
		list.add("Patna");list.add(null);
		
		System.out.println("Initial LinkList: "+list);
		list.addFirst("Ahmdabad");
		System.out.println(list.contains("Bhopal"));
		
		System.out.println(list.peekFirst());
		
		LinkedList<Integer> num = new LinkedList<>();
		for(int i=0;i<=20;i++)
		{
			if(i%2==0)
				num.add(i);
		}
		Object fNumber= num.getFirst();
		System.out.println("First even number "+fNumber);
		
		Object getel=num.get(4);
		System.out.println("np @ 4 :" +getel);
	}

}
