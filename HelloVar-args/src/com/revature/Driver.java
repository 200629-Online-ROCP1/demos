package com.revature;

public class Driver {
	
	
	//All three of these are valid ways to construct the main method signature. 
	//public static void main(String args[]) {
	//public static void main(String[] args) {
	public static void main(String... args) {
		
		int t = args.length;
		
		//System.out.println(args[0]);
		
		int myInts[] = {8,9,2,3,7};
		
		display("Dave", myInts);
		display("Reginald");
		display("Winston Churchill", 6, 7, 0, 2);
		
		objects("Fun", "Times", "Are", "Ahead");
		
	}
	
	//your var-arg must be the final parameter in your method signature. 
	public static void display(String str, int... arr) { 
		System.out.println(str);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void objects(Object... objects) {
		for(int i=0; i<objects.length; i++) {
			System.out.println(objects[i]);
		}
	}

}
