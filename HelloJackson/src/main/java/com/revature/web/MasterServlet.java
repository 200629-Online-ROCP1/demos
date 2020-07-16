package com.revature.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.controllers.AvengerController;
import com.revature.models.Avenger;

public class MasterServlet extends HttpServlet {

	private static final ObjectMapper om = new ObjectMapper();
	private static final AvengerController ac = new AvengerController();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("application/json");
		// this will set the default response to not found; we will change it later if
		// the request was successful
		res.setStatus(404);

		final String URI = req.getRequestURI().replace("/HelloJackson/", "");

		String[] portions = URI.split("/");

		System.out.println(Arrays.toString(portions));

		try {
			switch (portions[0]) {
			case "avenger":
				if (portions.length == 2) {
					int id = Integer.parseInt(portions[1]);
					Avenger a = ac.findById(id);
					res.setStatus(200);
					// The ObjectMapper (om) here will take the object (a) and convert it to a JSON object String.
					String json = om.writeValueAsString(a);
					res.getWriter().println(json);
				} else {
					if (req.getMethod().equals("POST")) {
						BufferedReader reader = req.getReader();

						StringBuilder s = new StringBuilder();

						String line = reader.readLine();

						while (line != null) {
							s.append(line);
							line = reader.readLine();
						}

						String body = new String(s);

						System.out.println(body);

						Avenger a = om.readValue(body, Avenger.class);
						
						System.out.println(a);

						if (ac.addAvenger(a)) {
							System.out.println("in addAvenger if statement");
							res.setStatus(201);
							res.getWriter().println("Avenger was created");
						}

					} else {

						List<Avenger> all = ac.findAll();
						res.setStatus(200);
						res.getWriter().println(om.writeValueAsString(all));

					}
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			res.getWriter().println("The id you provided is not an integer");
			res.setStatus(400);
		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}
