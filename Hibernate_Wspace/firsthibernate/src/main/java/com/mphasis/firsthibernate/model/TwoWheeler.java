package com.mphasis.firsthibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("BIKE")
public class TwoWheeler extends Vehicle{
	@Column(name="steeringHandleType", length=20)
	String steeringHandleType;
	public TwoWheeler() {
		
	}
	public String getSteeringHandleType() {
		return steeringHandleType;
	}
	public void setSteeringHandleType(String steeringHandleType) {
		this.steeringHandleType = steeringHandleType;
	}
	
}
