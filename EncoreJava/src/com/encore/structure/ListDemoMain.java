package com.encore.structure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import com.encore.inheritance.StudentDTO;

// List 계열의 자료구조는 순서가 있고, 증복 허용, 객체를(Object 상속받는 타입) 담으며, 동적이다. 
public class ListDemoMain {
	// 제네릭스 문법을 적용하지 않을 떄 반환되는 타입은 Object
	// 런 타임 시점에 객체에 접근하기 위해서는 캐스팅이 필요
	public static void main(String[] args) {

		// 리스트의 길이와 요소의 개수가 동일. 
		// 배열의 단점을 극복해서, 동적으로 요소를 추가하거나 바꾸기 편하다. 
		// 그냥 배열은 정적임. ArrayList는 동적임. 
		// 만약, Collection 에 담는다면, 	부모 타입은 자식으로 접근할 수 없으니, Casting 을 해주어야 한다. 
		List col01 = new ArrayList<StudentDTO>();
		//col01.add("A");
		//System.out.println(col01.size());
		col01.add(new StudentDTO());
		
		System.out.println("데이터를 가져온다면 " + ((StudentDTO) col01.get(0)).personInfo());
		
		List<String> col02 = new LinkedList<String>();
		col02.add("B");
		col02.add("C");
		col02.add("D");
		System.out.println(col02.get(1));

		Collection col03 = new HashSet();
		col03.add("C");
		
	}

}