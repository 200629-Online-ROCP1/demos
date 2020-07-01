package com.revature;

import com.revature.objects.Car;
import com.revature.objects.Movable;
import com.revature.objects.SportsCar;

public class Driver {

	public static void main(String[] args) {

		Car myCar = new SportsCar(4, "Maserati", "Red", 4, 200);
		
		Movable myCar2 = new SportsCar(4, "Maserati", "Red", 4, 200);
		
		myCar.drive();
		myCar.blowHorn();
		System.out.println(myCar2.getMaxSpeed());
		SportsCar sCar = (SportsCar) myCar2;
		sCar.drive();
		
		Movable mCar = sCar;
		
		//Car newCar = new Car(4, "Maserati", "Red", 4);
		//Movable move = new Movable();
	}

}
