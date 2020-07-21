package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MathOpsTests {
	
	int i;
	int j;
	int k;
	int result;
	
	static MathOps mo; 
	
	@BeforeClass
	public static void setMO() {
		System.out.println("Setting up with BeforeClass");
		mo = new MathOps();
	}
	
	@Before
	public void setInts() {
		System.out.println("Setting up variables with Before");
		i = 7;
		j = 5;
		k = 0;
		result = 0;
	}
	
	@After
	public void clearInts() {
		System.out.println("cleaning up variables with After");
		i = 0;
		j = 0;
		k = 0;
		result = 0;
	}
	
	@AfterClass
	public static void clearMO() {
		System.out.println("Cleaning up MathOps object with AfterClass");
		mo = null;
	}
	
	@Test
	public void testAdd() {
		System.out.println("testing add method");
		result = mo.add(i, j);
		assertTrue(result == 12);
	}
	
	@Test
	public void testSubtract() {
		System.out.println("Testing subtract method");
		result = mo.subtract(i, j);
		assertEquals(2, result);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivideZero() {
		System.out.println("Testing dividing by zero");
		result = mo.divide(i, k);
	}
	
	
	@Test
	public void testBadMultiplication() {
		System.out.println("Testing my bad multiplcation method");
		result = mo.badMultiply(i,j);
		assertTrue(result == 35);
	}
	
	@Test
	public void testBadMultiWithZero() {
		System.out.println("Testing multiplication with 0");
		result = mo.badMultiply(i, k);
		assertEquals(0, result);
	}
	
	@Test
	public void testBadMultNegative() {
		System.out.println("Testing negative multiplication");
		result = mo.badMultiply(j, -5);
		assertEquals(-25, result);
	}

}
