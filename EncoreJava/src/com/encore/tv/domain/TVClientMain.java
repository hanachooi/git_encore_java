package com.encore.tv.domain;

public class TVClientMain {

	public static void main(String[] args) {
		/*
		SamsungTV tv = new SamsungTV();
		tv.powerON();
		*/
		
		/*
		LgTV tv = new LgTV();
		tv.turnOn();*/
		
		// 인터페이스를 사용하면, 클라이언트 측에서의 소스 코드 수정이 없다.
		// 티비가 바뀌게 되면, SamsungTV() -> LgTV()로만 바꾸면 됌. 
		/*TV tv = new SamsungTV();
		tv.turnOn();*/
		
		
		// 이렇게 되면, 생성자 호출은 한 번 이루어지고,
		// 클라이언트가 바뀌게 되더라도 같은 인스턴스를 생성하게 된다. 
		/*TvBeanFactory t1 = TvBeanFactory.getInstance();
		System.out.println(t1);
		
		TvBeanFactory t2 = TvBeanFactory.getInstance();
		System.out.println(t2);
		*/
		
		TvBeanFactory factory01 = TvBeanFactory.getInstance();
		System.out.println(factory01);
		
		// 여기서 lg는 클라이언트를 통해, 받아오는 값임.
		TV tv = factory01.getBean("lg");
		tv.turnOn();
		
		// 즉, 인스턴스를 생성할 때, 팩토리로 부터 값을 받아서 객체를 생성함.
		// 이릁 통해, 클라이언트 쪽에서는 요소가 추가된다고 하더라고, 바뀔 필요가 없음.
		// 예를 들어, tv 종류가 추가되면 Bean에만 요소를 추가하면 되는 것. 
		
		
		
		
	}
}
