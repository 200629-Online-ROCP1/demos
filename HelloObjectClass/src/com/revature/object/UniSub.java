package com.revature.object;

public class UniSub extends University{

	//You can overload a final method but you can not override it. 
	public void checkover(int i) {
		System.out.println("I am final");
	}
	
	//Static methods can be overriden but must remain static. 
	public static void staticcheck() {
		System.out.println("I am overriding.");
	}
	
	public UniSub(int students, int professors, String name, int classrooms) {
		super(students, professors, name, classrooms);
	}
	

}
