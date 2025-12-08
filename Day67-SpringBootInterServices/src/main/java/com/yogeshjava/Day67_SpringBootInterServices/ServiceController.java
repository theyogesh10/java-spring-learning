package com.yogeshjava.Day67_SpringBootInterServices;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceController {

	@GetMapping("interservice")
	public String callOtherMethod() {
		
		RestTemplate template = new RestTemplate();
		List<User> output = template.getForEntity("http://localhost:8080/user", List.class).getBody();
		System.out.println(output);
		return "All OK";
	}
}


