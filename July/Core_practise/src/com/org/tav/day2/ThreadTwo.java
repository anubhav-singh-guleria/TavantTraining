package com.org.tav.day2;

public class ThreadTwo implements Runnable {

	public static void main(String[] args) {
		System.out.println("Main Thread Running");
		// TODO Auto-generated method stub
		ThreadTwo two = new ThreadTwo();
		Thread t=new Thread(two);
		Thread t1=new Thread(two);
		t1.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("new threading Running");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println(Thread.currentThread());
		
	}

}
