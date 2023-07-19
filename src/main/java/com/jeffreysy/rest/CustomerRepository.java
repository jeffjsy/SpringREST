package com.jeffreysy.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeffreysy.rest.Class.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}

