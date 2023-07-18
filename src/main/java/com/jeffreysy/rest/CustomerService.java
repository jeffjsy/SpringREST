package com.jeffreysy.rest;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface CustomerService {
		
	Iterable<Customer> findAll();
	Customer create(Customer customer);
	Optional<Customer> find(Long customer_id);
	Optional<Customer> findById(Long customer_id);
	
	
}
