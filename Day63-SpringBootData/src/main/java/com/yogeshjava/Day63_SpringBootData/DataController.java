package com.yogeshjava.Day63_SpringBootData;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@Autowired
	UserRepository repo;
	
	@Autowired
	DataService service;
	
	
	@GetMapping("/user")
	public List<User> getAllUsers() { 
		service.getAllData();
		List<User> data=repo.findAll(); 
		return data; 
	}
	
	@PostMapping("/user")
	public String storeUser(User user) {
		repo.save(user);
		return "data stored";
		
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable String id) {
		Optional<User> ref=repo.findById(id);
		return ref.get();
	}
	
	/*
	 * @GetMapping("/user/{data}/password")
	 * public List<User> getPassword(@PathVariable String data) { return
	 * repo.findByPass(data); }
	 */
	
	@GetMapping("/user/{data}/password") 
	public List<Object[]> getPassword(@PathVariable String data) {
		 
		List<Object[]> info=repo.searchPassword(data);
		return info;
		
	}
}
