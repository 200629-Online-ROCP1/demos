package com.revature.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Home;
import com.revature.repos.HomeDAO;

@Service
public class HomeService {
	
	@Autowired
	HomeDAO dao;
	
	public List<Home> findAll(){
		return dao.findAll();
	}
	
	public Optional<Home> findById(int id){
		return dao.findById(id);
	}
	
	public Optional<Home> findByName(String name){
		return dao.findByName(name);
	}
	
	public Home addHome(Home a) {
		return dao.save(a);
	}

}
