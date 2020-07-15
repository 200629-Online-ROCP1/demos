package com.revature.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController {
	
	public static String home(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("in home");
		return "/Home.html"; 
	}
	
	

}
