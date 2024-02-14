package com.encore.structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.encore.inheritance.EmployeeDTO;
import com.encore.inheritance.Person;
import com.encore.inheritance.StudentDTO;
import com.encore.inheritance.TeacherDTO;

public class ArrayListMain {

	public static void main(String[] args) {
		
		/*
		
		Number[] ary = new Number[5];	// static allocation ( 배열 )
		ary[0] = 10; 
		ary[1] = 20;
		ary[2] = 30;
		ary[3] = 40;
		ary[4] = 50;
		System.out.println("length : " + ary.length);
		ary[2] = null;
		System.out.println(Arrays.toString(ary));	// 실행하면, 인덱스 2번이 null이고, 배열의 길이는 유지된다.
		
		*/
		/*
		
		// List는 인터페이스이므로 객체 생성이 안된다.
		List<Number> lst = new ArrayList<Number>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);
		System.out.println("length : " + lst.size());
		lst.remove(2);
		System.out.println(lst.toString());	// 실행하면, 인덱스 2번이 사라지고, 리스트의 길이도 줄어든다.
		System.out.println(lst.size());
		
		*/
		
		List<String> lst = new ArrayList<String>();
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("E");
		System.out.println("length : " + lst.size());
		
		List<String> lst02 = new ArrayList<String>();
		lst02.add("1");
		lst02.add("2");
		
		// add 에 Collection 이 소유하는 요소의 값을 추가로 넣을 수 있음.
		lst.addAll(lst02);
		System.out.println(lst.toString());
		
		// add를 할 때, 인덱스의 번호를 지정해줄 수 있다.
		lst.add(3,  "f");
		System.out.println(lst.toString());
		
		
		// 주의점 , 특정 인덱스에 넣는다 해도, 기존에 들어있는 인덱스 내에서 넣어야 함.
		// 범위 외로 넣으면, IndexOutOfBoundsException 이다.
		//lst.add(300, "F");	// 예외가 발생함. 
		
		// 요소 검색
		System.out.println(lst.contains("C") ? "요소검색 완료" : "요소 검색 실패");
		
		// 요소의 부분 추출 (인덱스 1~4 까지 출력)
		List<String> subLst = lst.subList(0, 4);
		System.out.println(lst.subList(1, 5));
		
		// 특정 번지의 데이터를 삭제
		lst.remove(0);
		System.out.println(lst);
		
		// 사이즈를 동적으로 늘리는 작업이 가능
		((ArrayList<String>)lst).ensureCapacity(100);
		
		// 보안상의 이유로 딥카피를 해야한다면?
		// 중요.
		List<String> copyLst = (List<String>)((ArrayList<String>)lst).clone();
		System.out.println("original : " + lst);
		System.out.println("copy : " + copyLst);
		lst.set(0, "encore");
		System.out.println("origin : " +lst);
		System.out.println("copy" + copyLst);
		
		// 자료구조를 배열로 반환해야 한다면?
		Object[] ary = copyLst.toArray();
		
		// 정렬
		List<Integer> sortList = new ArrayList<>();
		sortList.add(3);
		System.out.println(sortList.toString());
		System.out.println("ascending sort");
		sortList.sort(Comparator.naturalOrder());
		
		
		// 순회
		List<Person> hmsLst = new ArrayList();
		hmsLst.add(new StudentDTO("임정섭", 20, "ㅇㅇ", "ㅇㅇ"));
		hmsLst.add(new TeacherDTO("임정섭", 20, "ㅇㅇ", "ㅇㅇ"));
		hmsLst.add(new EmployeeDTO("임정섭", 20, "ㅇㅇ", "ㅇㅇ"));
		
		for(int i = 0; i<hmsLst.size(); i++) {
			Person obj =  hmsLst.get(i);
			System.out.println(obj.personInfo());
		}
		
		// Iterator
		Iterator<Person> ite = hmsLst.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next().personInfo());
		}
		System.out.println("다시 한버너 순회 - ");
		ite = hmsLst.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next().personInfo());
		}
		
		// List에만 있ㄴ는 listIterator()
		ListIterator<Person> iter = hmsLst.listIterator();
		
		// 전체 데이터를 삭제
		lst.clear();
		System.out.println(lst);
		
		// 모든 Collection 객체를 담는 자료구조(그릇)
		List numberLst = new ArrayList();
		// int - Integer, char - Character (Mapper Class)
		// Mapper Class 는 8개의 기본 타입을 객체 타입으로 매핑하는 클래스.
		// 자료구조에는 기본 타입을 담을 수 없다. 
		// int x = 10; Integer xx = new Integer(x); -> Auto Boxing
		numberLst.add(1);		// 원래 라면 안되지만, Auto Boxing 이 이루어져서,가능하다. 
		
	}
}
