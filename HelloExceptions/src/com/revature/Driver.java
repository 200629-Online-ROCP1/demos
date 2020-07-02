package com.revature;

import com.revature.problems.MyCustomError;
import com.revature.problems.MyCustomException;
import com.revature.problems.MyRuntimeException;

public class Driver {
	
	public static void main(String[] args) {
		
		System.out.println("The main method is starting");
		
		try {
			throwError();			
		}
		catch(Error e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("I am in the error's finally block");
		}
//		
		try {
			throwException();
		} catch (MyCustomException e) {
			e.printStackTrace();
		}
		
		try {
			throwRuntimeException();			
		} catch(Error e) {
			e.printStackTrace();
		} 
		catch(MyRuntimeException e) {
			System.out.println("Caught MyRuntimeException.");
		} catch(RuntimeException e) {
			System.out.println("Caught runtime exception");
		}finally {
			System.out.println("Runtime finally");
		}
		
		
		
		System.out.println("You are at the end of the program.");
		
		
		
	}
	
	//throws means that it is possible for this method to encounter the identified error or exception
	public static void throwError() throws MyCustomError, MyRuntimeException {
		//throw will actually create the error object and force the stack to deal with it. 
		throw new MyCustomError("You have hit the error.");
	}
	
	public static void throwException() throws MyCustomException {
		System.out.println("I am about to throw an exception.");
		throw new MyCustomException();
	}
	
	public static void throwRuntimeException() {
		System.out.println("I am about to throw a runtime exception");
		throw new MyRuntimeException();
	}
	
	

}
