package com.mphasis.firsthibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CAR")
public class FourWheeler extends Vehicle{
	@Column(name="steeringHandleType", length=20)
	String steeringHandleType;
	public FourWheeler() {
		
	}
	public String getSteeringHandleType() {
		return steeringHandleType;
	}
	public void setSteeringHandleType(String steeringHandleType) {
		this.steeringHandleType = steeringHandleType;
	}
	
}