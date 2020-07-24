package com.revature.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Avenger;
import com.revature.repos.AvengerDAO;

@Service
public class AvengerService {
	
	@Autowired
	AvengerDAO dao;
	
	public List<Avenger> findAll(){
		return dao.findAll();
	}
	
	public Optional<Avenger> findById(int id){
		return dao.findById(id);
	}
	
	public Avenger addAvenger(Avenger a) {
		return dao.save(a);
	}

}
