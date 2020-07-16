package com.revature.services;

import java.util.List;

import com.revature.models.Avenger;
import com.revature.repos.AvengerDAO;
import com.revature.repos.IAvengerDAO;

public class AvengerService {
	
	private final IAvengerDAO dao = new AvengerDAO();
	
	public List<Avenger> findAll() {
		return dao.findAll();
	}
	
	public Avenger findById(int id) {
		return dao.findById(id);
	}

}
