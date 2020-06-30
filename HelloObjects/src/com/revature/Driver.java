package com.revature;

import com.revature.objects.*;

// There is an implicit import of the Java.lang package. 

public class Driver {
	
	public static void main(String args[]) {
		Car mozeriadi = new SportsCar("fast engine", 2, "RED!!!!", "Mozeradi", 2, true);
		System.out.println("============");
		
		Car myCar= new Car();
		
		myCar.move(10);
		
		System.out.println(mozeriadi.doors);
		System.out.println(mozeriadi.wheels);
		System.out.println(mozeriadi.engine);
		System.out.println(Car.wheels);		
		//System.out.println(Car.doors);
		
		System.out.println("============");
		mozeriadi.move(20);
		mozeriadi.reportSpeed(185);
	}

}
