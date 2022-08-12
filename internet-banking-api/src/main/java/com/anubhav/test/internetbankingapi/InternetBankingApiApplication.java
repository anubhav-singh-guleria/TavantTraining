package com.anubhav.test.internetbankingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InternetBankingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetBankingApiApplication.class, args);
	}

}
