package com.revature;

public class Driver {
	
	/*We can declare variables in a class. We can have static variables that belong
	 * to the class or instance variables that will be assigned to each object that will 
	 * retain their own copy. 
	 */
	
	public static boolean b;
	private static byte by = -120;
	static short s = 951;
	protected static int i = 65348;
	static long l = 100L;
	static float f = 3.58f;
	static double d = 58.92;
	static char c = 'A';
	
	public byte instancebyte;
	
	
	public static void main(String[] args) {
		int methodint =0;
		if(true) {
			boolean blockbool=false;
			System.out.println(blockbool);
			System.out.println(methodint);
		}
		Driver dr = new Driver();
		System.out.println(dr.instancebyte);
		adder();
		//System.out.println(methodint);
		System.out.println(s);
		//System.out.println(blockbool)
	}
	
	public static void printer() {
		System.out.println("boolean: "+b);
		System.out.println("byte: "+by);
		System.out.println("short: "+s);
		System.out.println("int: "+i);
		System.out.println("long: "+l);
		System.out.println("float: "+f);
		System.out.println("double: "+d);
		System.out.println("char: "+c);
	}
	
	public static void adder() {
//		byte bytesum = (byte) (by+by);
//		System.out.println(bytesum);
		
		int bytesum = by+by;
		int shortsum = s+s;
		int intsum = i+i;
		long longsum = l+l;
		float floatsum = f+f;
		double doublesum = d+d;
		int charsum = c+c;
		
		char castchar = (char) (c+5);
		System.out.println(castchar);
		System.out.println(charsum);
	}

}
