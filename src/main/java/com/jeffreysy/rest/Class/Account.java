package com.jeffreysy.rest.Class;

import com.jeffreysy.rest.Customer;

import jakarta.persistence.*;

@Entity
@Table(name = "Account")
public class Account {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "accountNumber")
    private Long accountNumber;

    @ManyToOne
    @JoinColumn(name = "accountTypeId")
    private AccountType accountType;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
    
    @Column(name = "balance")
    private Double balance;
    
    @Column(name = "overDraftLimit")
    private Double overDraftLimit;
    
    public Account() {}

	public Account(Long accountNumber, AccountType accountType, Customer customer, Double balance,
			Double overDraftLimit) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.customer = customer;
		this.balance = balance;
		this.overDraftLimit = overDraftLimit;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(Double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
    

}
