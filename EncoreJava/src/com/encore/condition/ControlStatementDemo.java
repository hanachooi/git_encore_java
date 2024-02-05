package com.encore.condition;

import java.util.Scanner;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class ControlStatementDemo {

	// A 또는 B라는 값을 기대할 수 있다.
	// 메뉴구성 ( 1, 금도끼 2, 은도끼 3, 쇠도끼)
	// 조건 1) 입력숫자는 1~3 사이
	// 조건 2) 1번 선택 시 '거짓말을 하는구나 아무 도끼도 줄 수 없다.'
	// 조건 3) 2번 선택 시 '거짓말을 하는 구나 아무 도끼도 줄 수 없다.'
	// 조건 4) 3번 선택시, 정직하구나.
	// 조건 5) 조건 판단이 끝나면, 끝
	

	public String ChooseDoki() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(true) {
			if(num < 1 || num > 3) {
				System.out.println("숫자를 다시 입력하세요");
				num = sc.nextInt();
			}else {
			
			
				switch(num) {
					case 1 :
						return ("거짓말을 하는구나 아무 도끼도 줄 수 없다");
				
					case 2 : 
						return ("거짓말을 하는구나 아무 도끼도 줄 수 없다");
					
					case 3 :
						return ("정직하구나");
				
				}
			}
		}
	}
	
	public String example01(){
		
		Scanner sc = new Scanner(System.in);
		int guk = sc.nextInt();
		int eng = sc.nextInt();
		int su = sc.nextInt();
		int total;
		double average;
		
		total = guk + eng + su;
		average = total / 3.0;
		
		
		if(guk >= 40 && su >= 40 && eng >= 40 && average >= 60) {
			return "합격";
		}else {
			return "불합격";
		}
		
	}
}
