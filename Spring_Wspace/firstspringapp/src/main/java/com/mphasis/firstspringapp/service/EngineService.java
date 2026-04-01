package com.mphasis.firstspringapp.service;

public class EngineService {
	private String type;
	 private int horsepower;
	public EngineService(String type, int horsepower) {
		this.type = type;
		this.horsepower = horsepower;
	}
	public String getType() {
		return type;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void engine() {
		System.out.println(type + horsepower);
	}
}
