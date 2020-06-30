package com.revature; //This is your package. It must be the first uncommented/not empty line in your class file.

public class Hello {
	
	//This is a single line comment. Everything on this line after the slashes will be ignored by the compiler.
	
	public static void main(String[] args) {
		System.out.println(test4("Hello Java")); //NOTE: You can put a comment after actual code on the same line. 
		test();	
	}
	
	
	private static void test() {
		
		Hello h = new Hello();
		h.test3();

		
								/* I'm writing an awesome comment...
		Int i = 9;					It will tell you lots of things */
		 
								 					
	}
	
	private static String test4(String s) {
		return s;
	}
	
	private void test3() {
		System.out.println("Hello again");
	}
	
	/* This is a multi-line comment
	 * it can span multiple lines.
	 * It too will be ignored by the compiler.
	 */

}

//This is a second class declared in the file. It can not be public.
class ANewClass{
	
	void test2() {
		//Hello.test();
	}
}
