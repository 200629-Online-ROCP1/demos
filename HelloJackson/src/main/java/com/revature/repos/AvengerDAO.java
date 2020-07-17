package com.revature.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Avenger;
import com.revature.models.Home;
import com.revature.util.ConnectionUtil;

public class AvengerDAO implements IAvengerDAO {
	
	private static final IHomeDAO hdao = new HomeDAO();

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
				
				if(result.getString("home_base_fk")!=null) {
					Home h = hdao.findByName(result.getString("home_base_fk"));
					a.setHome(h);
				}
				
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
				
				if(result.getString("home_base_fk")!=null) {
					Home h = hdao.findByName(result.getString("home_base_fk"));
					a.setHome(h);
				}
				
				return a;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addAvenger(Avenger a) {
		try(Connection conn = ConnectionUtil.getConnection()) {
			
			int index = 0;
			
			String sql = "INSERT INTO avengers(superhero_name, superhero_power, first_name, last_name, power_level)"
					+ " VALUES(?,?,?,?,?);";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(++index, a.getSupName());
			statement.setString(++index, a.getSupPower());
			statement.setString(++index, a.getfName());
			statement.setString(++index, a.getlName());
			statement.setInt(++index, a.getpLevel());
			
			statement.execute();
			return true;

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateHome(Avenger a) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "UPDATE avengers SET home_base_fk = ? WHERE superhero_id = ?;";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			int index = 0;
			
			statement.setString(++index, a.getHome().getName());
			statement.setInt(++index, a.getId());
			
			statement.execute();
			return true;
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
