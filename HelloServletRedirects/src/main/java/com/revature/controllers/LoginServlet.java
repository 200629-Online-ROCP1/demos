package com.revature.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.models.User;

public class LoginServlet extends HttpServlet {

	public LoginServlet() {
		super();
	}
	
	protected void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		//This notifies the client of the form in which the response is being sent back. In this case it is plain text or html, it could be json, xml, or other options.
		res.setContentType("text/html");
		User u = new User();
		
		u.setUsername(req.getParameter("userid"));
		u.setPassword(req.getParameter("password"));
		
		PrintWriter out = res.getWriter();
		
		RequestDispatcher rd = null;
		
		if(u.getUsername().equals("tom") && u.getPassword().equals("jerry")) {
			rd = req.getRequestDispatcher("success");
			rd.forward(req, res);
		} else {
			rd=req.getRequestDispatcher("index.html");
			rd.include(req, res);
			out.print("<center><span style='color:red;'>Invalid UserID/Password</span></center>)");
		}
		
	}

}
