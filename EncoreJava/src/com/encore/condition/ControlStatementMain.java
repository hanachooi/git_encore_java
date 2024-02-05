package com.encore.condition;

import java.util.Scanner;

public class ControlStatementMain {

	public static void main(String[] args) {

		// evenCheck();
		ControlStatementDemo cd = new ControlStatementDemo();
		// System.out.println(cd.ChooseDoki());
		System.out.println(cd.example01());
	}
	/*
	한 클래스 내의 함수를 static main에서 사용하려면, public static void 여야함. 
	public static void evenCheck() {
		// Scanner로부터 숫자 하나를 입력받아서 양수이면서
		// 짝수인지 아닌지를 판단하고 싶다면? - 짝수 또는 홀수를 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
		if(number>0) {
			System.out.println("양수입니다.");
			if(number % 2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
		}else {
			System.out.println("음수입니다.");
		}	
	}
	*/
}
