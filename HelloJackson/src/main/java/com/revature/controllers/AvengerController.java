package com.revature.controllers;

import java.util.List;

import com.revature.models.Avenger;
import com.revature.services.AvengerService;

public class AvengerController {
	
	private final AvengerService as = new AvengerService();
	
	public List<Avenger> findAll() {
		return as.findAll();
	}
	
	public Avenger findById(int id) {
		return as.findById(id);
	}

	public boolean addAvenger(Avenger a) {
		return as.addAvenger(a);
		
	}

}
