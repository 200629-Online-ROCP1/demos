package com.revature;

public class Driver {
	
	static int i = 0;
	
	public static void main(String[] args) {
		
		int a = i--;
		System.out.println(a);
		System.out.println(i);
		
		int b = --i;
		System.out.println(b);
		System.out.println(i);
		
		b /= i; 
		System.out.println(b);
		System.out.println(i);
		
		
	}

}
