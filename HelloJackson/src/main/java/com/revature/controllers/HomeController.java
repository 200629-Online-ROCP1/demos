package com.revature.controllers;

import java.io.BufferedReader;
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

	public void handlePost(HttpServletRequest req, HttpServletResponse res, String[] portions) throws IOException {

		if (portions.length == 2) {
			
			if(hs.updateHome(req, res, portions[1])) {
				res.setStatus(202);
				res.getWriter().println("Your new home assignment has been accepted.");
			} else {
				res.setStatus(400);
				res.getWriter().println("Your request was not able to be processed. Check your inputs.");
			}

		} else {

			BufferedReader reader = req.getReader();

			StringBuilder s = new StringBuilder();

			String line = reader.readLine();

			while (line != null) {
				s.append(line);
				line = reader.readLine();
			}

			String body = new String(s);

			System.out.println(body);

			Home h = om.readValue(body, Home.class);

			System.out.println(h);

			if (hs.addHome(h)) {
				res.setStatus(201);
				res.getWriter().println("Home was created");
			}
		}
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
