package com.revature.repo;

import java.util.Set;

import com.revature.models.Celebrity;

public interface CelebrityDAO {
	
	public boolean insert(Celebrity celeb);
	public boolean insertStatement(Celebrity celeb);
	public Celebrity findByFirstName(String firstName);
	public Set<Celebrity> selectAll();

}
