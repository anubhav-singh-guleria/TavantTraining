package com.org.tav.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
 
public class HashSetDemo {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
     HashSet<String> s = new HashSet<>();

     s.add("Orange");s.add("Blue");s.add("Red");s.add("Whilte");s.add("Pink");
     s.add("Red");
     System.out.println("Unordered set element : "+s);

     if(s.equals("Black")) {
         System.out.println("Black is not in the set");
     }else {
         s.add("Black");
         System.out.println("Black is added successfully ");
         System.out.println(s);
     }

     LinkedHashSet<String> l = new LinkedHashSet<>();
     l.add("Brown");
     l.add("Purpul");
     l.add("maroon");

     if(l.isEmpty()) {
         System.out.println(" set is empty ");
     }else {
         System.out.println(" No Set is not Empty ");
     }


     s.addAll(l);
     System.out.println("set element after adding element from given collection "+s);

     System.out.println(" Remove Black I dont like : "+s.remove("Black"));
     System.out.println(" Size of set : "+s.size());

    }
 
}