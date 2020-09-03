package com.telstra.pack1;

public class account {
	private double balance;
	private String accnumber;
	
	public account(double balance, String accnumber) {
		super();
		this.balance = balance;
		this.accnumber = accnumber;
	}
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("successfully deposited   Rs"+ amount);
		
		
	}
	public void withdraw(double amount) {
		if(amount<balance) {
		balance=balance-amount;
		System.out.println(amount+"  successfully withdrawn");
		
	}
		else {
			System.out.println("Not enough Funds!!");
		}
	}
	public double getbalance() {
		return balance;
		
	}
	
	public void transfer(double amount,account otheraccount) {
		if(amount<balance) {
		otheraccount.deposit(amount);
		balance=balance-amount;
	}
		else {
			System.out.println("Not enough funds!!");
		}
}
}