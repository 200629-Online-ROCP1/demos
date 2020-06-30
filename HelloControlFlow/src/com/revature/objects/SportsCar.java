package com.revature.objects;

public class SportsCar extends Car {
	
	public boolean hasTurbo; 
	
	public SportsCar(String engine, int doors, String color, String model, int seats, boolean hasTurbo) {
		super(engine, doors, color, model, seats);
		this.hasTurbo=hasTurbo;
	}
	
	public void move(int distance) {
		System.out.println("ZROOM ZROOM!!!!!");
		if(distance <= 250) {
			System.out.println("You are good to go!");
		} else {
			System.out.println("You will need to stop for gas!");
		}
	}

}
