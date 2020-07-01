package com.revature;

public class Driver {

	public static void main(String[] args) {
		String s = "Hello World";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb);
		
		//appending a StringBuilder is the same as concatenating a String except it modifies the original object. 
		sb.append(" Today is a great day");
		
		System.out.println(sb);
		
//		sb.append(true);
//		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		s = new String(sb);
		System.out.println(s);
		
		int[] intArray = new int[3];
		int[] intArr2 = {8,9,10};
		
		
	}

}
