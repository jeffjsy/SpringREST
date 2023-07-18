package com.jeffreysy.rest;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class InMemoryCustomerService implements CustomerService {
	private final Map<Long, Customer> customers = new ConcurrentHashMap<>();

	@Override
	public Collection<Customer> findAll(){
		return customers.values();
	}
	
	@Override
	public Customer create(Customer customer) {
		customers.put(customer.getCustomerId(), customer);
		System.out.println("Created customer with ID: " + customer.getCustomerId());
		return customer;
	}
	@Override
	public Optional<Customer> find(Long customerId){
		return Optional.ofNullable(customers.get(customerId));
	}

	@Override
	public Optional<Customer> findById(Long customer_id) {
		return find(customer_id);
	}
	
	
}
