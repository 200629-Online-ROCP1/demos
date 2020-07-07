package com.revarture;

import java.util.Comparator;

import com.revarture.models.Pokemon;

class ComparePokemonNames implements Comparator<Pokemon>{

	@Override
	public int compare(Pokemon p1, Pokemon p2) {
		return p1.getName().compareToIgnoreCase(p2.getName());
	}
	
}
