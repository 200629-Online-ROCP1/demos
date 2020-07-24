package com.revature.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Home;
import com.revature.services.HomeService;

@RestController
@RequestMapping(value="/home")
public class HomeController {
	
	@Autowired
	HomeService hs;

	
	@GetMapping
	public ResponseEntity<List> findAll(){
		List<Home> list = hs.findAll();
		return ResponseEntity.status(200).body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Home> findById(@PathVariable("id") String id){
		
		Optional<Home> oa;
		
		try {
			int i = Integer.parseInt(id);
			oa = hs.findById(i);
		} catch (NumberFormatException e) {
			oa = hs.findByName(id); 
		}
		
		if(oa.isPresent()) {
			Home a = oa.get();
			return ResponseEntity.status(200).body(a);
		}
		return ResponseEntity.status(204).build();
	}
	
	@PostMapping
	public ResponseEntity<Home> addHome(@RequestBody Home a){
		
		System.out.println(a);
		a = hs.addHome(a);
		return ResponseEntity.status(201).body(a);
	}
}
