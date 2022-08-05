package com.org.tav.day4;

import java.util.HashMap;
import java.util.Iterator;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "Red");
		map.put(102, "Blue");
		map.put(103, "Black");
		map.put(104, "Pink");
		map.put(104, "Green");
		System.out.println("Entried in map");
		int size=map.size();
		System.out.println("No of entries in Map"+size);
		
		HashMap<Integer,String> map2=new HashMap<>();
		map2.put(115, "Brown");
		map2.put(116, "Purple");
		map2.put(120, "Green");
		map2.putAll(map2);
		//Iterator<Integer,String> itr= map.entrySet().iterator();
		
		

	}

}
