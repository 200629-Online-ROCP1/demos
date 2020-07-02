package com.revature;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println(scan);
		
		System.out.println("Hello! Please enter your name:");
		String name = scan.nextLine();
		
		System.out.println("Hello "+name+". What is your favorite color:");
		String color = scan.nextLine();
		
		System.out.println("How old are you "+name+":");
		int age = scan.nextInt();
		
		System.out.println("Hello "+name+", you are "+age+" years old and your favorite color is "+color+".");
		
		//It is best practice to close your scanner when you are done using it. 
		scan.close();
	}

}
