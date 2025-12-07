package com.yogeshjava.Day66_SpringBootException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/error/{id}")
	public String testException(@PathVariable int id) throws Exception {
		if(id==1) {
			throw new Exception();
		}
		else {
			return "All OK";
		}
		
	}

}
