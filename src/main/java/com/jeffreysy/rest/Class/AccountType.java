package com.jeffreysy.rest.Class;

import jakarta.persistence.*;

@Entity
@Table(name = "AccountType")
public class AccountType {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "accountTypeId")
    private Long accountTypeId;
	
	@Column(name = "accountTypeName")
    private String accountTypeName;
	
	@Column(name = "accountTypeDesc")
    private String accountTypeDesc;
	
	@Column(name = "rate")
    private Double rate;
	
	public AccountType() {}

	public AccountType(Long accountTypeId, String accountTypeName, String accountTypeDesc, Double rate) {
		super();
		this.accountTypeId = accountTypeId;
		this.accountTypeName = accountTypeName;
		this.accountTypeDesc = accountTypeDesc;
		this.rate = rate;
	}

	public Long getAccountTypeId() {
		return accountTypeId;
	}

	public void setAccountTypeId(Long accountTypeId) {
		this.accountTypeId = accountTypeId;
	}

	public String getAccountTypeName() {
		return accountTypeName;
	}

	public void setAccountTypeName(String accountTypeName) {
		this.accountTypeName = accountTypeName;
	}

	public String getAccountTypeDesc() {
		return accountTypeDesc;
	}

	public void setAccountTypeDesc(String accountTypeDesc) {
		this.accountTypeDesc = accountTypeDesc;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

}
