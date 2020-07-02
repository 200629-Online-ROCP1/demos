package com.revature.problems;

public class MyCustomError extends Error{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	
	public MyCustomError() {
		
	}
	
	public MyCustomError(String message) {
		super(message);
	}
	
	public MyCustomError(String message, Throwable cause) {
		super(message, cause);
	}
	
}
