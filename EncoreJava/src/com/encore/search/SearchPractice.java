package com.encore.search;

import java.util.Scanner;

public class SearchPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		int[] arr = new int[N];
		int[] arr2 = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		
		int M = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i<M; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int low = 0;
		int high = arr.length-1;
		
		for(int i = 0; i<M; i++) {
			String s = find(arr2[i], low, high, arr);
			System.out.println(s);
		}
		
		
	}
	
	public static String find(int m, int low, int high, int[] arr) {
		int mid = low + (high - low)/2;
		if(arr[mid] == m) {
			return "Yes";
		}else if(arr[mid] < m) {
			low = mid;
			if(high > low) {
				return "NO";
			}
			return find(m, low, high, arr);
		}else {
			high = mid;
			if(high < low) {
				return "NO";
			}
			return find(m, low, high, arr);
		}
		
	}
	
}
