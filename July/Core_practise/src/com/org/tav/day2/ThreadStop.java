package com.org.tav.day2;

//why is stop method is deprecated in java and what is another way to kill the thread ?
//By using Boolean variable 
//By using isInterrupted() method 

public class ThreadStop extends Thread {
 static Thread t;
 public void run() {
     System.out.println("Thread Running ....");
     t.stop();
     System.out.println(" Carry on ....");
 }

 public static void main(String[] args) {
     // TODO Auto-generated method stub
     ThreadStop s = new ThreadStop();
      t = new Thread(s);
     t.start();

 }

}