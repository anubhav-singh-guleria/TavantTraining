package com.org.tav;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressManagerApplication {

	public static void main(String[] args) throws IOException {
		// ApiService apiService = new ApiService();
		// System.out.println(apiService.validation("Hogwarts"));
		SpringApplication.run(AddressManagerApplication.class, args);
	}

}
