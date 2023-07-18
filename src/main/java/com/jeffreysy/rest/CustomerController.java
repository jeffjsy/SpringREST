package com.jeffreysy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    
    @GetMapping
    public String list(Model model) {
        Iterable<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "index"; 
    }
    
    @GetMapping("/{customer_id}")
    public ResponseEntity<Customer> get(@PathVariable("customer_id") Long customer_id){
    	System.out.println("Received GET request for customer_id: " + customer_id);
    	return customerService.findById(customer_id)
    			.map(ResponseEntity::ok)
    			.orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public ResponseEntity create(@RequestBody Customer customer, UriComponentsBuilder uriBuilder){
    	Customer created = customerService.create(customer);
    	URI newCustomerUri = uriBuilder.path("/customers/{customer_id}").build(created.getCustomerId());
		return ResponseEntity.created(newCustomerUri).body(created);
    }
}

