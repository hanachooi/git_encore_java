package com.encore.test;

/*comment
 * XXXXVO.java, XXXXDTO.java, XXXXEntity.java
 * 위의 세 가지는 모두 동일한 기능을 함.
 * -- 업무 로직이 없고 데이터만 관리하는 클래스로 Setter, Getter로
 * 시작하는 메서드만 포함하게 됌. 
 */
public class StudentVO {
/*
 * 변수(Variable)
 * 구문형식 : 접근지정자 변수타입 변수명;
 * -- 접근지정자(public, private, protected)
 * -- 변수타입(기본타입, 참조타입)
 * 변수명(소문자로 시작해야한다.)
 */

	// 전역변수(클래스 내에서 접근가능한 범위를 갖는 것)
	// 모든 곳에서의 접근이 허용됌 -> public
	/*public String name;
	public int ade;
	public double height;
	public boolean isMarriage;*/
	
	// 접근지정자 -> private  -> getter setter 사용. 
	// dto 와 entity는 getter와 setter을 사용하는 것임. 이것이 , entity 역할의 끝
	
	private String a;
	
	// 생성자 구문형식 )
	// 접근지정자 클래스이름([매개변수]){ }
	// 매개변수가 없는 생성자는 기본 생성자
	// 매개변수가 있는 생성자는 스페셜 생성자
	// 명시적으로 생성자가 정의됮 않으면 컴파일 시점에 기본 생성자를 넣어서 컴파일을 진행
	
	// 메서드 구문형식 )
	// 접근지정자 반환타입 메서드이름([매개변수]) { return 반환타입; }

	
	// getter
	public String getA() {
		return a;
	}

	// setter
	public void setA(String a) {
		this.a = a;
	}
}
