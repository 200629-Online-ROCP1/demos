package com.revature.objects;

public class SportsCar extends Car {

	private static final long serialVersionUID = 1L;
	
	int fastestSpeed;
	
	public SportsCar(int wheels, String model, String color, int doors, int fastestSpeed) {
		super(wheels, model, color, doors);
		this.fastestSpeed = fastestSpeed;
	}

	@Override
	public int getMaxSpeed() {
		
		return fastestSpeed;
	}

	@Override
	public void drive() {
		
		System.out.println("I am speeding like a villian.");
		
	}
	
	public void blowHorn() {
		System.out.println("You're going to slow!");
	}

}
