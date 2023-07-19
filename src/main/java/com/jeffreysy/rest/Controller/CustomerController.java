package com.jeffreysy.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import com.jeffreysy.rest.CustomerService;
import com.jeffreysy.rest.Class.Customer;

import java.net.URI;
import java.util.List;

@Controller
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
        System.out.println("Obtaining index...");
        return "index"; 
    }
    
    @GetMapping("/customers.html")
    public String all(Model model) {
    	model.addAttribute("customers", customerService.findAll());
    	return "customers/list";
    }
    
    @GetMapping(value = "customers.html", params = "customer_id")
    public String get(@RequestParam("customer_id") Long customer_id, Model model) {
    	System.out.println("Received GET request for customer_id: " + customer_id);
    	customerService.find(customer_id)
    		.ifPresent(customer -> model.addAttribute("customer", customer));
    	return "customers/details";
    }
    
    @PostMapping("/customers")
    public Customer create(@ModelAttribute Customer customer) {
    	return customerService.create(customer);
    }
     
    
    // Depreciated methods Below
    @GetMapping("/{customer_id}")
    public ResponseEntity<Customer> get(@PathVariable("customer_id") Long customer_id){
    	System.out.println("Received GET request for customer_id: " + customer_id);
    	return customerService.find(customer_id)
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

