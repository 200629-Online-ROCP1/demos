package com.revature.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	
	public static String process(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("in switch");
		System.out.println(req.getRequestURI());

		switch(req.getRequestURI()) {
		case "/HelloMVC/api/Home":
			return HomeController.home(req, res);
		case "/HelloMVC/api/login":
			return LoginController.login(req, res);
		}
		
		return "/login.html"; 
	}

}
