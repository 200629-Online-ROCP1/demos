package com.revarture.models;

import java.util.Comparator;

public class Pokemon { //implements Comparable<Pokemon> {
	
	private int id;
	private String name;
	private String type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Pokemon(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	public Pokemon() {
		super();
	}
	
	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + ", type=" + type + "]";
	}

	//	@Override
//	public int compareTo(Pokemon p) {
//		return this.getName().compareToIgnoreCase(p.getName());
//	} 
	
}


	
