package com.revature.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Avenger;
import com.revature.models.Home;
import com.revature.services.HomeService;

public class HomeController {
	
	public static final HomeService hs = new HomeService();
	public static final ObjectMapper om = new ObjectMapper();

	public void handlePost(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub

	}

	public void handGet(HttpServletRequest req, HttpServletResponse res, String[] portions) throws IOException {

		if (portions.length == 2) {
			String name = portions[1];
			Home h = hs.findByName(name);
			res.setStatus(200);
			String json = om.writeValueAsString(h);
			res.getWriter().println(json);
		} else {
			List<Home> all = hs.findAll();
			res.setStatus(200);
			res.getWriter().println(om.writeValueAsString(all));
		}

	}

}
