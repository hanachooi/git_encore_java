package com.encore.sort;

import java.util.Arrays;

// 이미 정렬된 배열에서 사용.
public class InsertSortMain {

	public static void main(String[] args) {

		int[] ary = new int[10];
		for(int idx = 0; idx<ary.length; idx++) {
			ary[idx] = (int)(Math.random() * 100) + 1;
		}
		
		// Arrays.sort(ary);
		aryPrt(ary);
		//int insertIdx = findInsertIdx(ary, 50);
		//System.out.println(insertIdx);
		
		// 삽입 정렬
		int a;
		int b = 0;
		for(int i = 1; i<ary.length; i++) {
			for(int j = i-1; j>=0; j--) {
				if(ary[i] > ary[j] ) {
					b = j+1;
					break;
				}
				
			}
			
			for(int j = i; j>b; j--) {
				ary[j+1] = ary[j];
			}
			ary[b] = ary[i];
		}
		aryPrt(ary);
		
	}
	
	/*
	// 정렬된 배열에서 특정 데이터가 어느 번지에 삽입
	public static int findInsertIdx(int[] ary, int data) {
		
		for(int i = 0; i<ary.length; i++) {
			if(ary[i] == data) {
				return i;
			}
		}
		
		return -1;
	}
	*/
	
	// 배열 값 출력
	public static void aryPrt(int[] arr) {
		for(int i = 0; i<10; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

}
