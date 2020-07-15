package com.revature.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet{

	public LogoutServlet() {
		super();
	}
	
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.sendRedirect("/logout");
	}
	

}
