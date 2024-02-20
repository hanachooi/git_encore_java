package com.encore.compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/*
 
 정렬 : 모든 프로그램은 오름차순을 기본으로 정렬한다.
 JAVA  기준을 정의하지 않으면 오름차순
 - 기본타입과, 배열이 기본 타입을 요소로 가지고 있다면, Arrays.sort(), Collections.sort() 메서드를 사용하여 정렬
 
 [정렬의 일반화된 규칙]
 - 비교 결과가 리턴될 때
 - 음수 : 두 원소의 위치를 교환 안함.	{1, 3}, {3, 1}
 - 양수 : 두 원소의 위치를 교환
 
 */


public class CompareSubMain {

	public static void main(String[] args) {

		// 배열의 초기화
		EncoreInteger[] ary = new EncoreInteger[10];
		Random random = new Random();
        
		// 랜덤하게 배열 초기화 (1~100) : Random - randomInt(), Math - random();
		for(int i = 0; i<ary.length; i++) {
			// 객체의 초기화
			int randomNumber = random.nextInt(100) + 1;
			ary[i] = new EncoreInteger(randomNumber);
			System.out.println(ary[i].getData());
		}
		/* 객체 배열은 할 수 없다.
		Arrays.sort(ary);
		*/
		
		// 클래스 내에서 메서드를 이용하기 위해서, 만드는 클래스가 익명 클래스임. 
		Comparator<EncoreInteger> comm = new Comparator<EncoreInteger>() {
			
			@Override
			public int compare(EncoreInteger o1, EncoreInteger o2) {
				return o1.getData() - o2.getData();
			}
		};
		
		// 오름차순
		for(int i = 0; i<ary.length-1; i++) {
			for(int j = i+1; j<ary.length; j++) {
				int flag = comm.compare(ary[i], ary[j]);
				if(flag > 0) {
					int tmp = ary[i].getData();
					ary[i].setData(ary[j].getData()); 
					ary[j].setData(tmp);
				}
			}
		}
		
		
		System.out.println("오름차순 정렬");
		for(int i = 0; i<ary.length; i++) {
			System.out.println(ary[i].getData());
		}
		
		
	}
}
