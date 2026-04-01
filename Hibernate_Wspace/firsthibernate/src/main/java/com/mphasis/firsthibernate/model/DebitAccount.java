package com.mphasis.firsthibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "debitaccounts")
public class DebitAccount extends Account{
	@Column(name = "overdraftfee")
	private double overdraftfee;
	public DebitAccount() {
		
	}
	public double getOverdraftfee() {
		return overdraftfee;
	}
	public void setOverdraftfee(double overdraftfee) {
		this.overdraftfee = overdraftfee;
	}
	

}

