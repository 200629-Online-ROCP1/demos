package com.revature.services;

import java.util.List;

import com.revature.models.Home;
import com.revature.repos.HomeDAO;
import com.revature.repos.IHomeDAO;

public class HomeService {

	private static final IHomeDAO dao = new HomeDAO();
	
	public Home findByName(String name) {
		if(name.contains("%20")) {
			name = name.replace("%20", " ");
		}
		return dao.findByName(name);
	}

	public List<Home> findAll() {
		return dao.findAll();
	}

}
