package com.org.tav.day7;

import java.util.ArrayList;

interface Double{
    String doSomeCode(String str);
}
 
//pass method as a parameter by using lambda function 
public class LambdaDemo {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
   ArrayList<Integer> a = new ArrayList<>();
   a.add(10);a.add(20);a.add(30);a.add(40);a.add(50);

   a.forEach((n)->{System.out.println(n);});

   Double d = (str)->str+" Lambda ";
   show(" Functioal programing " , d);

    }
   public static void show(String s , Double d ) {
       String greet = d.doSomeCode(s);
       System.out.println(greet);
   }

    }
 