package com.encore.test;

public class Car {

	// 이렇게 선언을 할 경우, composition 관계임.
	private Engine engine;
	
	// 기본 생성자 정의 해보자
	// 인스턴스를 private으로 생성하면, 기본 생성자에서, 객체를 생성해줘야함. 
	public Car() {
		engine = new Engine();
	}
	public Car(String type) {
		engine = new Engine(type);
	}
	
	public void engineInfo() {
		String info = engine.showInfo();
		System.out.println(info);
	}
	
}
