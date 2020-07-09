package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This is a JavaDoc comment, it will show when hovered over this class when it imported somewhere else.
 * Utility class to create a connection to our database.
 * @author Revature
 *
 */

public class ConnectionUtil {
	
	public static Connection getConnection() throws SQLException {
		
		String url = "jdbc:postgresql://localhost:5432/celebs";
		String username = "postgres";
		String password = "password"; 
		
		return DriverManager.getConnection(url, username, password);
		
	}
	
	//test if the connection works
//	public static void main(String[] args) {
//		
//		//Try with resources will automatically close the resource at the end of the try or catch block
//		try(Connection conn = ConnectionUtil.getConnection()){
//			System.out.println("connection successful");
//		}catch(SQLException e) {
//			System.out.println(e);
//		}
//	}
}
