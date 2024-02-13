package com.encore.tv.domain;

public class SamsungTV implements TV{

	public SamsungTV() {
		
	}
	
	@Override
	public void turnOn() {
		System.out.println("Samsung TV PowerOn");		
	}
	
}
