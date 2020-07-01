package com.revature;

import java.util.ArrayList;

import com.revature.object.University;

public class Driver {

	public static void main(String[] args) {

		Object o = new Object();
		System.out.println(o.toString());
		System.out.println(o.hashCode());
		
		University myUni = new University( 10000, 2, "ROCP University", 0);
		University myUni2 = new University( 10000, 2, "ROCP University", 0);
		
		System.out.println(myUni);
		System.out.println(myUni==myUni2);
		System.out.println(myUni.equals(myUni2));
		
		Integer i = new Integer(7);
		System.out.println(i.toString());
		System.out.println(i.getClass());
		
		++i;
		
		System.out.println(i);
		System.out.println(i.getClass());
		
		int j =5;
		
		ArrayList<Integer> iList= new ArrayList<>();
		
		iList.add(j);
		
		

		
	}

}
