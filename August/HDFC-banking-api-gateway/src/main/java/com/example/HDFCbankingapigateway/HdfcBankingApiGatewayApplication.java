package com.example.HDFCbankingapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HdfcBankingApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HdfcBankingApiGatewayApplication.class, args);
	}

}
