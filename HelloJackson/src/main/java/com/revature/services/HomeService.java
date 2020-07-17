package com.revature.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.models.Avenger;
import com.revature.models.Home;
import com.revature.repos.AvengerDAO;
import com.revature.repos.HomeDAO;
import com.revature.repos.IAvengerDAO;
import com.revature.repos.IHomeDAO;

public class HomeService {

	private static final IHomeDAO dao = new HomeDAO();
	private static final IAvengerDAO aDao = new AvengerDAO(); 
	
	public Home findByName(String name) {
		if(name.contains("%20")) {
			name = name.replace("%20", " ");
		}
		return dao.findByName(name);
	}

	public List<Home> findAll() {
		return dao.findAll();
	}

	public boolean addHome(Home h) {
		return dao.insertHome(h);
	}

	public boolean updateHome(HttpServletRequest req, HttpServletResponse res, String name) {
		
		if(req.getParameter("avenger")!=null) {
			Integer id = Integer.valueOf(req.getParameter("avenger"));
			Avenger a = aDao.findById(id);
			Home h = dao.findByName(name);
			a.setHome(h);
			if(aDao.updateHome(a)) {
				return true;
			}

		}
		return false;
		
	}

}
