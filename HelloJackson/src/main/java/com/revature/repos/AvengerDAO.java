package com.revature.repos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Avenger;
import com.revature.util.ConnectionUtil;

public class AvengerDAO implements IAvengerDAO {

	@Override
	public List<Avenger> findAll() {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM avengers;";
			
			Statement statement = conn.createStatement();
			
			List<Avenger> list = new ArrayList<>();
			
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				Avenger a = new Avenger();
				a.setId(result.getInt("superhero_id"));
				a.setSupName(result.getString("superhero_name"));
				a.setSupPower(result.getString("superhero_power"));
				a.setfName(result.getString("first_name"));
				a.setlName(result.getString("last_name"));
				a.setpLevel(result.getInt("power_level"));
				
				list.add(a); 
				
			}
			
			return list;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Avenger findById(int id) {
		try(Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM avengers WHERE superhero_id = "+id+";";
			
			Statement statement = conn.createStatement();
			
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {
				Avenger a = new Avenger();
				a.setId(result.getInt("superhero_id"));
				a.setSupName(result.getString("superhero_name"));
				a.setSupPower(result.getString("superhero_power"));
				a.setfName(result.getString("first_name"));
				a.setlName(result.getString("last_name"));
				a.setpLevel(result.getInt("power_level"));
				
				return a;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addAvenger(Avenger a) {
		// TODO Auto-generated method stub
		return false;
	}

}
