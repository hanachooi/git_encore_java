package com.encore.workbook;

// 소수 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Workshop1Main {

	public static void main(String[] args) throws IOException{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("숫자를 입력하세요 : ");
		int a = Integer.parseInt(br.readLine());
		boolean b = false;
		
		for(int i=2; i<a; i++) {
			if((a % i) == 0) {
				System.out.println(a + "은(는) 소수가 아닙니다.");
				b = true;
				break;
			}
		}
		if(b = false) {
			System.out.println(a + "은(는) 소수입니다.");
		}
		
	}

}
