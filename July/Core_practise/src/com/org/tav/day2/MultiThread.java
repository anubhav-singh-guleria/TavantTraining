package com.org.tav.day2;

public class MultiThread extends Thread

{
	String task;
	public MultiThread(String task) {
		super();
		this.task=task;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(task +":"+i);
			try {
				Thread.sleep(2000);
			}catch (Exception e){
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThread t1=new MultiThread("cut the ticket");
		MultiThread t2=new MultiThread("Show the seat ticket");
		
		Thread tt= new Thread(t1);
		Thread tt1=new Thread(t2);
		tt.start();
		tt1.start();

	}

}
