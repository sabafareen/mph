package com.mphasis.firsthibernate.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	private String address;
	private String city;
	private String pin;
	public Address() {
		
	}
	public Address(String address, String city, String pin) {
		this.address = address;
		this.city = city;
		this.pin = pin;
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
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
}
