package com.mphasis.firsthibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "creditaccounts")
public class CreditAccount extends Account{
	@Column(name = "creditLimit")
	private double creditLimit;
	public CreditAccount() {
		
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

}
