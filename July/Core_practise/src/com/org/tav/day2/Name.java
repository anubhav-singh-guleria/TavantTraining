package com.org.tav.day2;


class Student {
    String name; int rollno ; int id ;
    Student(String schoolName ){
        this(2);
        System.out.println("Student Data");
    }
    Student(int s ){
        System.out.println("Delhi Public School");
    }
    Student(String name , int rollno , int id){
        this("DPS");
        this.name=name;
        this.rollno=rollno;
        this.id=id;
    }
    void show() {
    System.out.println("Name :"+name+" "+"rollNo :"+rollno +"id : "+id);    
    }
}
public class Chaining extends Student{
 
    
    public Chaining() {
        super("ABC", 2, 1234);
        // TODO Auto-generated constructor stub
        //System.out.println(" Java is devloped by James ");
    }
      Chaining(String schoolName){
          this();
      }

    void disp() {
        System.out.println(" OOPs ");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        Chaining c = new Chaining("DPS");
        c.show();
    }
 
}