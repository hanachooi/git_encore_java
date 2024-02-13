package com.encore.tv.domain;

/*
 Singleton Pattern : 인스턴스의 갯수를 하나로 유지하는 방법
 */

public class TvBeanFactory {

	private TV[] ary;
	private static TvBeanFactory instance;
	
	// 생성자의 접근지정자를 private으로 한다.
	// 부모 클래스인 TV에 자식 객체들을 담는다. 
	private TvBeanFactory() {
		ary = new TV[2];
		ary[0] = new SamsungTV();
		ary[1] = new LgTV();
	}
	
	// getInstance()를 정의해서 자기자신의 생성된 객체를 반환하는 구현
	public static TvBeanFactory getInstance() {
		if(instance == null) {
			instance = new TvBeanFactory();
		}
		return instance;
	}
	
	// getBean을 하면, TV에 요청에 따른 객체가 초기화된다.
	public TV getBean(String brandName) {
		return (brandName.equals("samsung")) ? ary[0] : ary[1];
	}
	
}
