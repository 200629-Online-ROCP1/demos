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

	public boolean addAvenger(Avenger a) {
		List<Avenger> list = findAll();
		
		for(Avenger av: list) {
//			System.out.println(av);
//			System.out.println(a);
			if(av.getfName().equals(a.getfName()) && av.getlName().equals(a.getlName()) && av.getSupName().equals(a.getSupName()) ) {
				return false;
			}
		}
	
		boolean b = dao.addAvenger(a);
		System.out.println("boolean in AS = " +b);
		return b;
	}

}
