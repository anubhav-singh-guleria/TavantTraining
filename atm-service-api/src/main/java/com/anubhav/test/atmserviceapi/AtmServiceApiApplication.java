package com.anubhav.test.atmserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AtmServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtmServiceApiApplication.class, args);
	}

}
