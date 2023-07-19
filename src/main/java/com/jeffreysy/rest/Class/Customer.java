package com.jeffreysy.rest.Class;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
public class Customer {
	
    @Id       
    public Long customer_id;    
    private String username;   
    private String password;   
    private String firstName;    
    private String lastName;
    private String address;
    private String city;
    private String postalCode;
    private String phone;
    private String emailId;
    
    public Customer() {
    }

    @JsonCreator
	public Customer(
			@JsonProperty("customer_id") Long customer_id, 
			@JsonProperty("username") String username,
			@JsonProperty("password") String password,
			@JsonProperty("firstName") String firstName, 
			@JsonProperty("lastName") String lastName,
			@JsonProperty("address") String address,
			@JsonProperty("city")String city, 
			@JsonProperty("postalCode")String postalCode, 
			@JsonProperty("phone")String phone, 
			@JsonProperty("emailId")String emailId) {
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

