package com.org.tav.day1;

public class Account {
	
	class accountdetails{
		private String username;
		private int accBalance;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public int getAccBalance() {
			return accBalance;
		}
		public void setAccBalance(int accBalance) {
			this.accBalance = accBalance;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		
		accountdetails a1= new accountdetails();
		
		a1.setUsername("Reethik");
		a1.setAccBalance(50);
	}

}
