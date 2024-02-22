package com.encore.search;

import java.util.Random;

public class binarySearchMain {

	public static void main(String[] args) {

		// 코테 시 : Wrapper(int - Integer) 
		// Integer i = new Integer(10); int sum = i + 10;
		// 원래는 Integer과 int의 결과가 안되는데, ide에서는 묵시적 형변환을 해주기 때문에, 가능함.
		// 객체 비교를 통한 sorting
		// Arrays.sort 나 comparable 등을 쓸 때는, Integer[] ary = new Integer[10]; 을 사용하는데,
		// ary[i] == ary[j] 로 하면 안되고, ary[i].equals(ary[j]) 로 비교해야함.
		// 즉, Integer 등의 객체 배열을 비교할 때는, .equals를 이용해야 함. 
		
		Integer[] ary = {1, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		System.out.println("정렬 전 데이터");
		aryPrt(ary);
		
		/*
		 이진탐색 개념 정리
		 - 중앙값의 인덱스를 필요
		 - 찾고자 하는 데이터 (target)
		 - low(0), high(ary.length - 1) 의 값을 알아야 한다. 
		 */
		
		int low = 0;
		int high = ary.length -1;
		int target = 8;
		
		System.out.println("target : " + target);
		
		int findIdx = search(low,high, ary, target);
		
		if(findIdx != -1) {
			System.out.println("탐색 완료 : " + ary[findIdx]);
		}else {
			System.out.println("탐색 실패 : " + findIdx);
		}
		
	}
	
	public static void aryPrt(Integer[] ary) {
		for(Integer a : ary) {
			System.out.print(a + "  ");
		}
		System.out.println();
	}
	
	// 반복구문 >>>>
	// return value : index
	
	// 재귀함수에서는, stackoverFlow가 발생할 수 있어서, 오류가 발생할 경우, 재귀 함수 호출에 제한을 두기 위해서, 
	// count를 이용해서 횟수 제한을 해준다. 
	public static int search(int low, int high, Integer[] ary, int target/*, int count*/) {
		int mid = low + (high - low) / 2;
		
//		if(count < 0) {
//			return -1;
//		}
		
		if(ary[mid].equals(target)) {
			return mid;
		}else if((int)ary[mid] < target) {
			low = mid;
			if(high < low) {
				return -1;
			}
			return search(low,high, ary, target/*, --count*/);
			
		}else {
			high = mid;
			if(high  < low) {
				return -1;
			}
			return search(low, high, ary, target/*, --count*/);
		}
	}

}
