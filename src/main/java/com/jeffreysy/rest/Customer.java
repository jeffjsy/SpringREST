package com.jeffreysy.rest;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
	
    @Id   
    @Column(name = "customerId")
    private Long customer_id;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "firstName")
    private String firstName;
    
    @Column(name = "lastName")
    private String lastName;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "city")
    private String city;
    
    @Column(name = "postalCode")
    private String postalCode;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "emailId")
    private String emailId;
    
    public Customer() {
    }

	public Customer(Long customer_id, String username, String password, String firstName, String lastName,
			String address, String city, String postalCode, String phone, String emailId) {
		super();
		this.customer_id = customer_id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.phone = phone;
		this.emailId = emailId;
	}

	public Long getCustomerId() {
		return customer_id;
	}

	public void setCustomerId(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override 
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Customer customer = (Customer) o;
		return Objects.equals(customer_id, customer.customer_id);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(customer_id);
	}

	@Override
	public String toString() {
		return String.format("Customer [customer_id=%s, username=%s, emailId=%s]", this.customer_id, this.username, this.emailId);
	}

}

