package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Avenger;

public interface AvengerDAO extends JpaRepository<Avenger, Integer> {

}
