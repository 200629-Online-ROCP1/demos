package com.revature.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Home;

public interface HomeDAO extends JpaRepository<Home, Integer> {
	
	public Optional<Home> findByName(String name);

}
