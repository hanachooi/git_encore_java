package com.encore.condition;

import java.util.Scanner;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class VerdingMachine {
	
	@NonNull
	private String type;
	
	
	public static final int COLA = 800;
	public static final int WATER = 500;
	public static final int VITAWATER = 1500;
	
	Scanner sc = new Scanner(System.in);
	public int remainmoney;
	
	
	
	public void init() {
		
		System.out.println("금액을 입력하세요. : ");
		int totalprice = sc.nextInt();
		System.out.println("메뉴를 고르시오. \n"
				+ "1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원) >>");
		
		switch(getType()) {
			case "if" :
				ifVending(totalprice);
				break;
			case "switch" :
				switchVeding(totalprice);
				break;
		}
		
		System.out.println("잔돈 : " + remainmoney);
		System.out.println("천원 : " + remainmoney / 1000 + " 개, "
				+ "오백원 : " + (remainmoney % 1000) / 500 + " 개, "
				+ "백원 : " + remainmoney % 500 / 100 + " 개 "
				);
	}
	
	private int ifVending(int totalprice) {
	
		int num = sc.nextInt();
		
		if(num == 1) {
			remainmoney = totalprice - COLA;
		}else if(num == 2) {
			remainmoney =  totalprice - WATER;
		}else {
			remainmoney = totalprice - VITAWATER;
		}
		return remainmoney;
		
	}
	// 같은 클래스 내에서는 private은 public 처럼 쓸 수 있음. 
	private int switchVeding(int totalprice) {

		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			remainmoney = totalprice - COLA;
			break;
		case 2 :
			remainmoney =  totalprice - WATER;
			break;
		case 3 :
			remainmoney = totalprice - VITAWATER;
			break;
		}
		return remainmoney;
	}
}
