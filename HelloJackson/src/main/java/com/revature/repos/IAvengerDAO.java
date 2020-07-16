package com.revature.repos;

import java.util.List;

import com.revature.models.Avenger;

public interface IAvengerDAO {
	
	public List<Avenger> findAll();
	public Avenger findById(int id);
	public boolean addAvenger(Avenger a);

}
