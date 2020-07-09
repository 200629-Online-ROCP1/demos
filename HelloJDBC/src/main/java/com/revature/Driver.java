package com.revature;

import java.util.Set;

import com.revature.models.Celebrity;
import com.revature.repo.CelebrityDAO;
import com.revature.repo.CelebrityDAOImpl;

public class Driver {

	public static void main(String[] args) {
		CelebrityDAO dao = CelebrityDAOImpl.getInstance();

		//Celebrity celeb = new Celebrity("Elaine", "Paige", "Grizzabella", "female"); 
		//dao.insertStatement(celeb);

//		Celebrity c = dao.findByFirstName("Tony");
//		System.out.println(c);
		
		Set<Celebrity> set = dao.selectAll(); 
		
		for(Celebrity c: set) {
			System.out.println(c);
		}
		
		
	}

}
