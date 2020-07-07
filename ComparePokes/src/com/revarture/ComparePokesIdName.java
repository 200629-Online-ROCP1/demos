package com.revarture;

import java.util.Comparator;

import com.revarture.models.Pokemon;

public class ComparePokesIdName implements Comparator<Pokemon>{

	@Override
	public int compare(Pokemon o1, Pokemon o2) {
		int i = o1.getId()-o2.getId();
		if(i == 0) {
			return o1.getName().compareToIgnoreCase(o2.getName());
		}
		return i; 
	}
	
	

}
