package com.revature;

import com.revature.objects.SportsCar;

public class Driver {
	
	
	
	public static void main(String[] args) {
		
		SportsCar myCar = new SportsCar("kewl engine name", 2, "Black", "Mazada RX-8 R3", 4, true);
		
		myCar.move(200);
		myCar.move(300);
		
		boolean con = true; 
		
		while(myCar.hasTurbo && showSC()) {
			System.out.println("I can go fast!!!!!");
			if(con) {
				System.out.println("in if statement");
				con = false;
				continue; 
			}
			System.out.println("I am out of the if statement");
			myCar.hasTurbo=false;
		}
		
//		do {
//			System.out.println("Hit the gas slowpoke!");
//			myCar.hasTurbo = !myCar.hasTurbo;
//		} while(myCar.hasTurbo);
//		
//		for(int i=0; i<=myCar.seats; i=i+1) {
//			System.out.println("You have filled "+i+" seats in your car");
//		}
//		
//		switch(myCar.color) {
//			case "White": System.out.println("My car is the easiest to keep looking clean!"); break;
//			case "Black": System.out.println("My car is dark as night, like Batman!"); break;
//			case "Purple": System.out.println("My car is the coolest color there is!"); break;
//			default: System.out.println("I don't know my car is blah."); break;
//		}
		

	}
	
	public static boolean showSC() {
		System.out.println("In showSC");
		return true;
	}

}
