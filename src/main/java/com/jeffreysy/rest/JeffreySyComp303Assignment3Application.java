package com.jeffreysy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jeffreysy.rest.Class.Customer;

@SpringBootApplication
public class JeffreySyComp303Assignment3Application {

	public static void main(String[] args) {
		SpringApplication.run(JeffreySyComp303Assignment3Application.class, args);
		System.out.println("Launching Application...");
	
	}

	
	@Bean
	public ApplicationRunner customerInitializer(CustomerService customerService) {
		return args -> {
			customerService.create(
					new Customer((long) 101, "jsy", "password123", "Jeffrey", "Sy", "123 Main St",
							"Toronto", "11000", "555-258-5961", "jeffjsy@gmail.com"));
			customerService.create(
					new Customer((long) 102, "bwayne", "password456", "Bruce", "Wayne", "432 Rich St",
							"Gotham City", "10101", "555-124-4233", "bwayne@wayneindustries.com"));
			customerService.create(
					new Customer((long) 103, "tstark", "richman74", "Tony", "Stark", "999 Wealthy Rd",
							"Los Angeles", "11111", "555-324-9543", "Tony@starkindustries.com"));
			customerService.create(
					new Customer((long) 104, "spidey", "maryjane", "Peter", "Parker", "533 4th St",
							"New York", "32874", "555-984-0273", "pparker@nyu.edu"));
			customerService.create(
					new Customer((long) 105, "supes", "manofsteel", "Clark", "Kent", "2398 Yonge St",
							"Metropolis", "32441", "555-992-7854", "ckent@dailybugle.com"));
		};
	}
}