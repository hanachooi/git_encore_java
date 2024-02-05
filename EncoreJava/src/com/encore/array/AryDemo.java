package com.encore.array;

import java.util.Scanner;

public class AryDemo {

	public AryDemo() {
		
	}
	
	// Scanner 를 이용해서 5명 학생들의 국어점수만 입력받아 총합과 평균을 구하는 로직을 구현하고 싶다면?
	public int[] makeScores() {
		int[] scoreAry = new int[5];
		Scanner scan = new Scanner(System.in);
		
		for(int idx = 0; idx<scoreAry.length; idx++) {
			System.out.println((idx+1) + "번쩨 학생의 점수를 입력하세요 : ");
			scoreAry[idx] = scan.nextInt();
		}
		
		return scoreAry;
	}
	public void scorePrint(int[] ary) {
		int sum = 0; 
		int avg = 0;
		for(int idx = 0; idx<ary.length; idx++) {
			sum += ary[idx];
		}
		
		avg = sum / ary.length;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
	
}
