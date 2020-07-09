package com.revature.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.revature.models.Celebrity;
import com.revature.util.ConnectionUtil;

public class CelebrityDAOImpl implements CelebrityDAO {

	//This is a design pattern called a singleton where only one implementation of a class can exist at a time.
	//This is not necessary for your project, you may leave it out and create multiple DAO objects. 
	private static CelebrityDAOImpl repo = new CelebrityDAOImpl();
	
	private CelebrityDAOImpl() {}
	
	public static CelebrityDAOImpl getInstance() {
		return repo;
	}
	
	@Override
	public boolean insert(Celebrity celeb) {
		System.out.println("In Inserting Celeb");
		
		try(Connection conn = ConnectionUtil.getConnection()){
			int index =0;
			String sql = "INSERT INTO celebrity(first_name, last_name, stage_name, gender) "
					+ "VALUES(?,?,?,?)";
			
			
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(++index, celeb.getFirstName());
			statement.setString(++index, celeb.getLastName());
			statement.setString(++index, celeb.getStageName());
			statement.setString(++index, celeb.getGender());
			
			System.out.println(statement);
			
			if(statement.execute()) {
				return true;
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public boolean insertStatement(Celebrity celeb) {
		System.out.println("In insertStatement");
		
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "INSERT INTO celebrity(first_name, last_name, stage_name, gender)"
					+ "VALUES('"+celeb.getFirstName()+"','"+celeb.getLastName()+"','"+celeb.getStageName()+"','"+celeb.getGender()+"');";
			
			Statement statement = conn.createStatement();
			
			if(statement.execute(sql)) {
				return true;
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		return false;
	}

	@Override
	public Celebrity findByFirstName(String firstName) {
		System.out.println("in find by name");
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM celebrity WHERE first_name = ?";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, firstName);
			
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				return new Celebrity(result.getInt("id"), result.getString("first_name"),
						result.getString("last_name"), result.getString("stage_name"), 
						result.getString("gender"));
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Set<Celebrity> selectAll() {
		System.out.println("In Select All");
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM celebrity;";
			
			Statement statement = conn.createStatement();
			
			Set<Celebrity> set = new HashSet<>();
			
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				set.add(new Celebrity(result.getInt("id"), result.getString("first_name"),
						result.getString("last_name"), result.getString("stage_name"), 
						result.getString("gender")));
			}
			
			return set;
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		
		return null;
	}

}
