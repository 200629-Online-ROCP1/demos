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

import com.revature.models.Avenger;
import com.revature.services.AvengerService;

@RestController
@RequestMapping(value="/avenger")
public class AvengerController {
	
	@Autowired
	AvengerService as;
	
	@GetMapping
	public ResponseEntity<List> findAll(){
		List<Avenger> list = as.findAll();
		return ResponseEntity.status(200).body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Avenger> findById(@PathVariable("id") int id){
		Optional<Avenger> oa = as.findById(id);
		
		if(oa.isPresent()) {
			Avenger a = oa.get();
			return ResponseEntity.status(200).body(a);
		}
		return ResponseEntity.status(204).build();
	}
	
	@PostMapping
	public ResponseEntity<Avenger> addAvenger(@RequestBody Avenger a){
		a = as.addAvenger(a);
		return ResponseEntity.status(201).body(a);
	}

}
