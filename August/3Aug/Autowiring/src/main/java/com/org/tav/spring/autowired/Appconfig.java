package com.org.tav.spring.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
	
	@Bean(name="passport")
	public Passport getPassport()
	{

		return new Passport();
		
	}
	
	@Bean
	public Employee getEmployee()
	{
		return new Employee();
		
	}
}