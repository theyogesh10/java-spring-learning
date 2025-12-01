package com.yogeshjava.Day61_SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/hello")
	public String showMessage() {
		return "Hello World : Spring Boot";
	}

}
