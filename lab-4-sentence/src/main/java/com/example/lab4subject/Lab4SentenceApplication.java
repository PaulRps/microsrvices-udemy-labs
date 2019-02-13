package com.example.lab4subject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4SentenceApplication {


	@Bean 
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}  

	public static void main(String[] args) {
		SpringApplication.run(Lab4SentenceApplication.class, args);
	}

}

