package com.org.tav.day4;

import java.util.TreeMap;

public class TreemapDemo {

public static void main(String[] args) {
// TODO Auto-generated method stub
TreeMap<Integer, String> tm = new TreeMap<>();
tm.put(25,"Jhone");tm.put(32, "rainy");
tm.put(28, "Abyuk");tm.put(78, "Yuhana");
tm.put(23, "Rose");
tm.put(35, "Peter");
tm.put(24,"Rocky");
System.out.println("Sorted Map "+tm);
System.out.println("Descending order map : "+tm.descendingMap());
System.out.println("Haed map :"+tm.headMap(24, true));
System.out.println("TailMap : "+tm.tailMap(30, true));
System.out.println("SubMap : "+tm.subMap(22, false, 32, true));
System.out.println("ceilingEntry :"+tm.ceilingEntry(23));
System.out.println("firstkey "+tm.firstEntry());
System.out.println("Lastkey "+tm.lastEntry());

}

}