package com.yogeshjava.Day63_SpringBootData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
	
	@Autowired
	UserRepository repo;
	
	public List<Object[]> getAllData(){
		
		return repo.findByPassAndUser(null, null);

	}

}
