package com.org.tav.day2;

//in method overriding method call is resolved by JVM based on runtime object(new Obj )

//in method hiding , method call is resolved by compiler based on reference type(Object obj);
class ParentClass{
 public static void m1() {
     System.out.println("Class Method in parent class");
 }
 void instaceMethod() {
     System.out.println("instanceMethod in Parent class");
 }
}

class Childclass extends ParentClass{
 public static void m1() {
     System.out.println("Class Method in child class");
 }
 void instaceMethod() {
     System.out.println("instanceMethod in child class");
 }
}


public class MyClass {

 public static void main(String[] args) {
     // TODO Auto-generated method stub
ParentClass p = new Childclass();
p.m1();//method hiding
p.instaceMethod();//overrriding

Childclass c = new Childclass();
c.m1();
c.instaceMethod();

ParentClass p1 = new ParentClass();
p1.m1();
p1.instaceMethod();


 }

}