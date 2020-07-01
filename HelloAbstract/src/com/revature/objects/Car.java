package com.revature.objects;

import java.io.Serializable;

public abstract class Car implements Movable, Serializable {
	
	public int wheels;
	public String model;
	public String color;
	public int doors;
	
	
	
	public Car(int wheels, String model, String color, int doors) {
		super();
		this.wheels = wheels;
		this.model = model;
		this.color = color;
		this.doors = doors;
	}

	public void blowHorn() {
		System.out.println("BEEP BEEP!!");
	}
	
	public abstract void drive();

}
