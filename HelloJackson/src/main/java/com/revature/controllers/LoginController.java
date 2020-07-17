package com.revature.controllers;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.LoginDTO;
import com.revature.services.LoginService;

public class LoginController {
	
	private static final LoginService ls = new LoginService();
	private static final ObjectMapper om = new ObjectMapper();
	
	public void login(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		if(req.getMethod().equals("POST")) {
			BufferedReader reader = req.getReader();
			
			
			StringBuilder s = new StringBuilder();
			
			String line = reader.readLine();
			
			while(line != null) {
				s.append(line);
				line=reader.readLine();
			}
			
			String body = new String(s);
			
			System.out.println(body);
			
			LoginDTO l = om.readValue(body, LoginDTO.class);
			
			if(ls.login(l)) {
				//Note - the no args getSession method will create a new session if one does not already exist for this client. 
				HttpSession ses = req.getSession();
				ses.setAttribute("user", l);
				ses.setAttribute("loggedin", true);
				res.setStatus(200);
				res.getWriter().println("Login Successful!");
			} else {
				//will only return a session if one is already associated with the request, will not create a new one. 
				HttpSession ses = req.getSession(false);
				if(ses!=null) {
					//This will throw out the session, the client will no longer have a session associated with their cookie. 
					ses.invalidate();
				}
				res.setStatus(401);
				res.getWriter().println("Login Failed");
			}
		} else if (req.getMethod().equals("GET")
				&&(req.getParameterMap().containsKey("username")
						&&(req.getParameterMap().containsKey("password")))) {
			
			LoginDTO l = new LoginDTO();
			l.username = req.getParameter("username");
			l.password = req.getParameter("password"); 
			
			if(ls.login(l)) {
				//Note - the no args getSession method will create a new session if one does not already exist for this client. 
				HttpSession ses = req.getSession();
				ses.setAttribute("user", l);
				ses.setAttribute("loggedin", true);
				res.setStatus(200);
				res.getWriter().println("Login Successful!");
			} else {
				//will only return a session if one is already associated with the request, will not create a new one. 
				HttpSession ses = req.getSession(false);
				if(ses!=null) {
					//This will throw out the session, the client will no longer have a session associated with their cookie. 
					ses.invalidate();
				}
				res.setStatus(401);
				res.getWriter().println("Login Failed");
			}
		}
	}

	public void logout(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession ses = req.getSession(false);
		
		if(ses!=null) {
			LoginDTO l = (LoginDTO) ses.getAttribute("user");
			ses.invalidate();
			res.setStatus(200);
			res.getWriter().println(l.username+" you logged out.");
		} else {
			res.setStatus(400);
			res.getWriter().println("You must be logged in to log out.");
		}
		
	}

}
