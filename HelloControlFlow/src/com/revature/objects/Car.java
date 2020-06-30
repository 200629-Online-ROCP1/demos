package com.revature.objects;

public class Car {
	
	//final keyword will ensure the value is not changed after it is initialized
	public static final int wheels = 4;
	
	public String engine;
	public int doors;
	public String color;
	public String model;
	public int seats;
	
	public Car() { 	}
	
	public Car(int doors, String color, String model, int seats) {
		this.doors = doors;
		this.color = color;
		this.model = model;
		this.seats = seats;
	}
	
	public Car(String e, int doors, String color, String model, int seats) {
		this(doors, color, model, seats);
		engine = e; //not good practice
	}
	
	public void move(int distance) {
		System.out.println("The "+model+" drives "+distance+" miles forward on "+wheels+" wheels!");
	}
	
	public void reportSpeed(int mph) {
		System.out.println("You are going "+mph+" miles per hour");
	}

}
