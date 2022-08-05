package com.org.tav.day2;

public class MyThreads extends Thread {
	
	@Override
	public void run() {
		System.out.println("New Thread Running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main thread running");
		MyThreads t1= new MyThreads();
		Thread t = new Thread(t1);
		t.start();

	}

}
