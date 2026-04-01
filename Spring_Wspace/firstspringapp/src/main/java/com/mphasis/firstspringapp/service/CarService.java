package com.mphasis.firstspringapp.service;

public class CarService {
	private String model;
	private EngineService engine;
	private int year;

	public CarService(String model, EngineService engine, int year) {
		this.model = model;
		this.engine = engine;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public EngineService getEngine() {
		return engine;
	}

	public int getYear() {
		return year;
	}

public void car() {
    System.out.println(
        model + "," +
        year + "," +
        engine.getType() + "," +
        engine.getHorsepower()
    );
}
}
