package com.org.tav.day2;

class A implements Runnable{
	 
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Child Thread1 start running ...");
        for(int i = 1 ; i<=3;i++) {
            System.out.println("I :"+i);
        }
        System.out.println("Child Thread 1 is ending ");
    }

}
 
class B implements Runnable{
 
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Child Thread 2 start running ...");
        for(int j = 1 ; j<=3;j++) {
            System.out.println("J :"+j);
        }
        System.out.println("Child Thread 2 is ending ");
    }
    }


 
 
public class JoinDemo {
 
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
    	A a=new A();
    	Thread t1 = new Thread(a);
    	B b = new B();
    	Thread t2 = new Thread(b);
    	
    	t1.start();
    	t1.join();
    	
    	System.out.println("Main Thread is ending");
 
    }
 
}