package com.visa.prj.client;

import com.visa.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		Account first = new Account("SBI123");
		Account second = new Account("SBI120");
		
		first.deposit(5000); // deposit(first, 5000)
		second.deposit(2500); // deposit(second, 2500)
		
		System.out.println("first account");
		System.out.println("Balance: " + first.getBalance());
		
		System.out.println("second account");
		System.out.println("Balance: "+ second.getBalance());
		
		System.out.println("*********");
		
		Account rahul = new Account("SBI100");
		Account shweta = new Account("SBI100");
		
		Account ref = rahul;
		
		if (ref == rahul) {
			System.out.println("ref and rahul points to the same location");
		}
		
		if(rahul.equals(shweta)){
			System.out.println("Same content!!");
		}
		
		System.out.println("Count: "+ Account.getCount());
	}

}
