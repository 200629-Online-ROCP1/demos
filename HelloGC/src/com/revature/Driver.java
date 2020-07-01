package com.revature;

public class Driver {

	public static void main(String[] args) {

		String s1 = new String("Hello");
		String s2 = new String("Goodbye");
		String s3 = s1;
		s2 = s3; //String "Goodbye" becomes available for garbage collection here.
		
		
		String s4 = new String("Hey Hey");
		String s5 = new String("cya"); 
		s1 = s4;
		s4 = s5;
		s1 = s5; //Now "Hey Hey" is available for garbage collection.
		
		
	}

}
