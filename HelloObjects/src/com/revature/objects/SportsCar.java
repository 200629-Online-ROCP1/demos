package com.revature.objects;

public class SportsCar extends Car {
	
	boolean hasTurbo; 
	
	public SportsCar(String engine, int doors, String color, String model, int seats, boolean hasTurbo) {
		super(engine, doors, color, model, seats);
		System.out.println("Sport Cars constructor");
		this.hasTurbo=hasTurbo;
	}
	
	public void move(int distance) {
		System.out.println("ZROOM ZROOM!!!!!");
	}

}
