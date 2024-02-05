package com.encore.staticDemo;


public class StaticMain {

	public static void Main(String[] args) {
		
		StaticDemo demo = new StaticDemo("jslim");
		System.out.println(demo.getName());
		
		
		// staticMethod() 인스턴스 소유가 아닌 클래스 소유이므로 클래스 이름으로 접근 가능
		StaticDemo.staticMethod();
		// nonStatic() 메서드 인스턴스를 생성해야만 접근이 가능. 
		/// StaticDemo.nonStatic();
		
		StaticDemo demo02 = new StaticDemo("encore");
		
		
	}
}
