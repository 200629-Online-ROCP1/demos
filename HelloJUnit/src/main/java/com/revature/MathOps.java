package com.revature;

public class MathOps {
	
	public int add(int i, int j) {
		return i+j;
	}
	
	public int subtract (int i, int j) {
		return i-j;
	}
	
	public int divide(int i, int j) {
		return i/j;
	}

	public int badMultiply(int i, int j) {
		int result = 0;
		boolean negative = false;
		
		if(i<0^j<0) {
			negative = true;
		}
		
		
		for(int k = 0; k<Math.abs(j); k++ ) {
			result += Math.abs(i);
		}
		
		if(negative) {
			result*=-1;
		}
		
		return result;
	}
	

}
