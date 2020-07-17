package com.revature.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Home;
import com.revature.models.Home;
import com.revature.models.Home;
import com.revature.util.ConnectionUtil;

public class HomeDAO implements IHomeDAO {

	@Override
	public Home findByName(String name) {
		try(Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM homes WHERE home_base = '"+name+"';";
			
			Statement statement = conn.createStatement();
			
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) {
				Home h = new Home();
				h.setName(result.getString("home_base"));
				h.setAddress(result.getString("hb_address"));
				h.setCity(result.getString("hb_city"));
				h.setState(result.getString("hb_state"));
				h.setZip(result.getString("hb_zip"));
				
				return h;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Home> findAll() {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM homes;";
			
			Statement statement = conn.createStatement();
			
			List<Home> list = new ArrayList<>();
			
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				Home h = new Home();
				h.setName(result.getString("home_base"));
				h.setAddress(result.getString("hb_address"));
				h.setCity(result.getString("hb_city"));
				h.setState(result.getString("hb_state"));
				h.setZip(result.getString("hb_zip"));

				list.add(h); 
				
			}
			
			return list;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertHome(Home h) {
try(Connection conn = ConnectionUtil.getConnection()) {
			
			int index = 0;
			
			String sql = "INSERT INTO homes(home_base, hb_address, hb_city, hb_state, hb_zip)"
					+ " VALUES(?,?,?,?,?);";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(++index, h.getName());
			statement.setString(++index, h.getAddress());
			statement.setString(++index, h.getCity());
			statement.setString(++index, h.getState());
			statement.setString(++index, h.getZip());
			
			statement.execute();
			return true;

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
