package com.revature.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.models.User;

public class LoginController {
	
	public static String login(HttpServletRequest req, HttpServletResponse res) {
		
		//first thing we want to do is check that this a POST request
		if(!req.getMethod().equals("POST")) {
			return "/login.html";
		}
		
		String username = req.getParameter("username");
		String password = req.getParameter("password"); 
		User u = new User(username,password);
		
		User u2 = new User("derp","drowssap");
		
		if(u.username.equals(u2.username) && u.password.equals(u2.password)) {
			System.out.println("login worked!");
			
			return "/api/Home";
		} else {
			return "/login.html";
		}
	}

}
