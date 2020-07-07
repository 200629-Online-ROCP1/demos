package com.revature.models;

public class BankAccount {
	
	private double balance = 0;
	private String type = "Checking";
	private String owner = "Bill Gates";
	
	
	public BankAccount(double balance, String type, String owner) {
		super();
		this.balance = balance;
		this.type = type;
		this.owner = owner;
	}


	public BankAccount() {
		super();
	}


	public String getOwner() {
		return owner;
	}


	public double getBalance() {
		return balance;
	}
	
	public boolean setBalance(double d) {
		if(d<0) {
			return false;
		} else {
			balance = d;
			return true;
		}
	}

	

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", type=" + type + ", owner=" + owner + "]";
	}
	
	
	
			

}
