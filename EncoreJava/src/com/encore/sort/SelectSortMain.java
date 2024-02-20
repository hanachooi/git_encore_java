package com.encore.sort;

import java.util.Random;

public class SelectSortMain {

	public static void main(String[] args) {

		// Step 01. 10개의 방을 가지는 배열을 만들고 랜덤하게 (1~100)의 값을 초기화 후 정렬 전 출력
		int[] arr = new int[10];
		Random random = new Random();
		
		for(int i = 0; i<10; i++) {
			arr[i] = random.nextInt(100)+1;
		}
		
		System.out.println("정렬 전 출력");
		aryPrt(arr);
		int min = 110;
		
		// Step 02. 초기화 된 배열로부터 최소값에 들어 있는 인덱스를 리턴받아보자. 
		for(int i = 0; i<9; i++) {
			int m = findMin(arr, i);
			int tmp = arr[m];
			arr[m] = arr[i];
			arr[i] = tmp;
		}
		
		System.out.println();
		System.out.println("정렬 후 출력");
		aryPrt(arr);
		
	}

	public static void aryPrt(int[] arr) {
		for(int i = 0; i<10; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
	
	// 최소값을 반환하는 함수 
	public static int findMin(int[] arr, int a) {
		int min = 110;
		int m = 0;
		for(int i = a; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
				m = i;
			}
		}
		return m;
	}
}
