package com.revature.repos;

import java.util.List;

import com.revature.models.Home;

public interface IHomeDAO {

	public Home findByName(String name);

	List<Home> findAll();

}
