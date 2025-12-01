package com.yogeshjava.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Player getPlayer() {
		return new Player(2,"Renuka Thakur",10, dob());
	}
	
	public SpecialDate dob() {
		return new SpecialDate(11,07,1980);
	}

}
