package com.encore.workbook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

// Guess Game

public class Workshop2Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random random = new Random();
		System.out.println("***********************************\r\n"
				+ " 1에서100사이의숫자를맞춰보세요.\r\n"
				+ " 10번의기회가있습니다.\r\n"
				+ " ***********************************");
		
		int randomInt = random.nextInt(100) + 1;

		for(int i = 0; i<10; i++) {
			System.out.println((i+1) + "번째 기회 입니다. 숫자를 입력하세요 : ");
			int A = Integer.parseInt(br.readLine());
			if(A == randomInt) {
				System.out.println("축하합니다." + (i+1) + "번 만에 맞추셨네요.");
				break;
			}else if(A > randomInt) {
				System.out.println(A + " 보다 작습니다.");
			}else {
				System.out.println(A + " 보다 큽니다.");
			}
		}
		
	}

}
