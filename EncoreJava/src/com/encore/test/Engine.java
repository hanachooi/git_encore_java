package com.encore.test;

public class Engine {

	private String engineType;
	
	public Engine() {
	
	}
	public Engine(String engineType) {
		this.engineType = engineType;
	}
	public String showInfo() {
		return engineType;
	}
	
}
