package com.org.tav.day4;

import java.util.LinkedHashMap;

public class LinkedhashMapDemo {

public static void main(String[] args) {
// TODO Auto-generated method stub

LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();
int size =lmap.size();
System.out.println(" before adding element "+size);

System.out.println(" Is linkedhap Map empty ? :"+lmap.isEmpty());

lmap.put("harsha", 22);
lmap.put("Anubhav", 22);
lmap.put("Harshita", 21);
lmap.put("Sivam", 23);

LinkedHashMap<String, String> map2 = new LinkedHashMap<>(16,0.75f,true);
map2.put("En", "English");
map2.put("Hi", "Hindi");
map2.put("Ta", "tamil");
map2.put("De", "German");
map2.put("Fr", "French");

System.out.println(" entries of ,map :"+map2);
System.out.println(" Value corresponding to key Hi "+map2.get("Hi"));
System.out.println(" entries of ,map :"+map2);
System.out.println(" Value corresponding to key De "+map2.get("De"));
System.out.println(" entries of ,map :"+map2);

System.out.println("\n");
System.out.println(" Map 3 Entries ...");
LinkedHashMap<String, String> map3 = new LinkedHashMap<>(16,0.75f,false);
map3.put("En", "English");
map3.put("Hi", "Hindi");
map3.put("Ta", "tamil");
map3.put("De", "German");
map3.put("Fr", "French");

System.out.println(" entries of ,map :"+map3);
System.out.println(" Value corresponding to key Hi "+map3.get("Hi"));
System.out.println(" entries of ,map :"+map3);
System.out.println(" Value corresponding to key De "+map3.get("De"));
System.out.println(" entries of ,map :"+map3);
}

}