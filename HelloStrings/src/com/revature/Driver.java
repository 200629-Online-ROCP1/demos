package com.revature;

public class Driver {

	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = "hello world";
		String s4 = new String("Hello World");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		System.out.println("=======================");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.toLowerCase().equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1);
		
		System.out.println("=======================");
		System.out.println(s1.charAt(0));
		//System.out.println(s1.charAt(11));
		//System.out.println(s1.charAt(-1));
		
		System.out.println("=======================");
		for(int i=0; i<s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		System.out.println("=======================");
		String sub = s1.substring(2, 7);
		System.out.println(sub);
		
		
		String[] arr = s1.split(" ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		if(s1.contains("Hell")) {
			System.out.println("I do so contain!");
		}
		System.out.println("=======================");
		
		s1 = s1.concat(s3);
		System.out.println(s1);
		
		//Escape Sequences -- Added Week 4
		
		System.out.println("=======================");
		
		System.out.println(String.format("%s said hello to %s", "Sandy", "Chris"));
		
		System.out.format("%02.1f was the average quiz score%nI was really happy with your\nSUCCESS!!!!!!!!" , 91.9);
		

	}

}
