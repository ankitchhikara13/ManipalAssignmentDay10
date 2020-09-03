package com.telstra.pack1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account a1=new account(1000,"12334");
		a1.deposit(1000);
	
		account a2=new account(4000,"1234");
		a2.deposit(2000);
		a1.transfer(100,a2);
		a1.withdraw(100);
		a2.withdraw(50000);
		System.out.println(a1.getbalance());
		System.out.println(a2.getbalance());

	}

}
