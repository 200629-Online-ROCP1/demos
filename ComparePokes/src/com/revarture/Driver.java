package com.revarture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.revarture.models.Pokemon;

public class Driver {

	public static void main(String[] args) {

		List<Pokemon> myPokemon = new ArrayList<>(); 
		
		myPokemon.add(new Pokemon(7, "Squirtle", "Water"));
		myPokemon.add(new Pokemon(1, "Bulbasaur", "Grass"));
		myPokemon.add(new Pokemon(4, "Charmander", "Fire"));
		myPokemon.add(new Pokemon(25, "Pikachu", "Electric"));
		myPokemon.add(new Pokemon(151, "Mew", "Psychic"));
		myPokemon.add(new Pokemon(25, "1Pikachu", "Electric"));
		myPokemon.add(new Pokemon(25, "pikachu", "Electric"));
		myPokemon.add(new Pokemon(34, "Mankey", "Fighting"));
		myPokemon.add(new Pokemon(34, "mankey", "Fighting"));
		
//		for(Pokemon p : myPokemon) {
//			System.out.println(p);
//		}
		
//		Pokemon poke = new Pokemon(7, "Squirtle", "Water");
//		Pokemon poke2 = new Pokemon(1, "Bulbasaur", "Grass");
//		
//		int result = poke.compareTo(poke2);
//		System.out.println(result);
		
		//Collections.sort(myPokemon, new ComparePokemonNames());
		//Collections.sort(myPokemon, new ComparePokesIdName());
//		
//		for(Pokemon p : myPokemon) {
//			System.out.println(p);
//		}
		
		
		Map<String, Pokemon> trainers = new TreeMap<>(new TrainerHelper());
		trainers.put("Sandy", new Pokemon(7, "Squirtle", "Water"));
		trainers.put("Tim", new Pokemon(151, "Mew", "Psychic"));
		trainers.put("Ash", new Pokemon(25, "Pikachu", "Electric"));
		trainers.put("Gary", new Pokemon(34, "Mankey", "Fighting"));
		
		
		Iterator it = trainers.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, Pokemon> pair = (Entry<String, Pokemon>) it.next();
			System.out.println(pair.getKey() + "=>" + pair.getValue());
		}
		
	}
}

class TrainerHelper implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}
