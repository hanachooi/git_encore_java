package com.encore.generic;

import java.util.ArrayList;
import java.util.List;

// 제네릭스는 상속을 기반으로 한다. 
public class GenericsMain {

	public static void main(String[] args) {

		/*
		 <? extends XXXX> , <? super XXXX>
		 제네릭스 사용 시 코드상의 이점 ?
		 - 컴파일 타입시 타입의 안정성 유지
		 - 불필요한 다운캐스팅을 지양할 수 있다.
		 - 
		 
		 */
		/*
		// 클래스의 제너릭과 객체 생성 할 때의 제네릭을 동일하게 해야함.
		// <T>
		ClassName<Student> obj = new ClassName<Student>();
		
		/// 클래스에서 이용하는 변수의 타입을 외부에서 지정해줌. 
		// <E>
		ClassName<String> obj01 = new ClassName<String>();
		ClassName<Integer> obj02 = new ClassName<Integer>();
		
		// 이런식으로 클래스 내부의 변수 타입을 지정해줌. 
		obj01.setXXXX("a");
		obj02.setXXXX(1);
		
		// <K,V>
		// Map<String,Integer> map = new HashMap<String, Integer>();
		
		ClassName<String, Integer> obj3 = new ClassName<String, Integer>();
		obj3.setXXXX("10", 10);
		System.out.println("key value" + obj.getKey());
		System.out.println("변수의 타입 출력 " + obj.getKey().getClass().getName());
		
		*/
		
		// 제너릭스의 다형성
		// 와이드카드(?)를 사용할 수 있다. 
		// xxx.do, xxxx.encore 으로 끝나게 됌.
		// 실행 경로가 아래와 같이 .do가 되게 되는데,
		// 이러면, xxxx에 어떤게 들어와도 요청을 받을 수 있게 됌.
		// http://serverIP:port/a/b/xxxx.do 
		// http://serverIP:port/a/b/insert.do
		// http://serveerIP:port/a/b/select.do
		
		/*
		List<Sports> lst = new ArrayList<Sports>();
		
		// Sport를 상속받고 있는 모든 것을 다 받을 수 있다.
		lst.add(new Golf());
		lst.add(new Skating());
		lst.add(new ShortTrack());
		lst.add(new SpeedSkating());
		*/
		
		// Skating을 extends 하고 있는 와일드 카드를 의미함.
		// <? extends Skating> : Skating을 상속받는 모든 하위 객체를 포함한다.
		// <? super Golf> : 골프의 모든 상위 객체를 포함한다. Golf와 Golf의 상위인 Sports와
		// Sports를 상속받는 Skating 이 가능 
		// List<? extends Skating> lst = new ArrayList<>();
		
		// Sport를 상속받고 있는 모든 것을 다 받을 수 있다.
//		lst.add(new Golf());
//		lst.add(new Skating());
//		lst.add(new ShortTrack());
//		lst.add(new SpeedSkating());
		
		// ? 저장은 X, 꺼낼 수 있는데 반환 타입은 Object
		// 메서드의 리턴타입, 매개변수 지정하는 데만 사용
		// List<?> lst = new ArrayList<>();
		// lst.add(null); null 값은 허용
		// lst.add(new Golf());	// 객체를 담을 수 없기 때문에 Error
		
		/*
		// <? extends Skating> == <Skating>
		// 저장은 X , 꺼낼 수 있는데 반환 타입은 Skating
		// 메서드의 리턴타입, 매개변수 지정을 하는데만 사용
		List<? extends Skating> list = new ArrayList();
		list.add(new SpeedSkating());	// 객체를 담을 수 없기 때문에 Error
		list.add(null); 		// null 값은 담을 수 있음
		*/
		
		// 저장 가능 ( 타입 : Golf, 상위타입 )
		// 반환타입은 Object
		// List<? super Golf> lst = new ArrayList();
		
		// 상황에 대한 이해 ...
		List<Sports> list = new ArrayList<Sports>();
		// Sports 밑에는 다른 두 타입인 Golf와 SpeedSkating이 있으므로, 이걸 받으려면
		// super Skating을 받아야함. 만약, extends Skating을 받게 되면,
		// Skating이 되기 때문에, getExtendsMethod에서 오류가 발생한다.
		// list.add에서 타입이 Sport로 들어가므로, new Golf와 new SpeedSkating은 들어갈 수 있음. 
		list.add(new Golf());
		list.add(new SpeedSkating());
		getExtendsMethod(list);
	}
	
	// 반환 타입이, Golf가 되면, SpeedSkating이 에러가 나게 됌.
	public static void getExtendsMethod(List<? super Golf> lst) {
		
	}
}
