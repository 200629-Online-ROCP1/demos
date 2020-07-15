package com.revature.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController {
	
	public static String login(HttpServletRequest req, HttpServletResponse res) {
		
		//first thing we want to do is check that this a POST request
		if(!req.getMethod().equals("POST")) {
			return "/login.html";
		}
		
		String username = req.getParameter("username");
		String password = req.getParameter("password"); 
		
		if(username.equals("derp") && password.equals("drowssap")) {
			System.out.println("login worked!");
			
			return "/api/Home";
		} else {
			return "/login.html";
		}
	}

}
