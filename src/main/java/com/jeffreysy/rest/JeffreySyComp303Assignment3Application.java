package com.jeffreysy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class JeffreySyComp303Assignment3Application {

	public static void main(String[] args) {
		SpringApplication.run(JeffreySyComp303Assignment3Application.class, args);
		System.out.println("Launching Application...");
	
	}
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Bean
	public ApplicationRunner customerInitializer(CustomerService customerService) {
		return args -> {
			customerService.create(
					new Customer((long) 101, "jdoe", "password123", "John", "Doe", "123 Main St",
							"New York", "10001", "555-123-4567", "john.doe@example.com"));
			customerService.create(
					new Customer((long) 102, "bwayne", "password456", "Bruce", "Wayne", "432 Rich St",
							"Gotham City", "10101", "555-124-4233", "bruce@wayne.com"));
			customerService.create(
					new Customer((long) 103, "tstark", "richman74", "Tony", "Stark", "999 Wealthy Rd",
							"Los Angeles", "11111", "555-324-9543", "Tony@Stark.com"));
		};
	}
}
