package com.revature;

import com.revature.models.BankAccount;

public class Driver {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.setBalance(100);
		System.out.println(ba);
		
		ba.setBalance(-500);
		System.out.println(ba);
	}

}
