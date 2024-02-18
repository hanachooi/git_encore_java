package com.encore.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2798 {

	public static void main(String[] args) throws IOException{ 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int a = 1;		// 분자
		int b = 2;		// 분모
		
		if(N == 1) {
			System.out.println(1);
		}else if(N == 2) {
			System.out.println(a + "/" + b);
		}else {
		
			for(int i = 2; i<N; i++) {
			
				if(a == 1) {
					if((a+b)%2 == 0) {
						b++;
						continue;
					}
					if((a+b) % 2 != 0) {
						a++;
						b--;
						continue;
					}
							
				}else if(b == 1) {
					if((a+b) % 2 != 0) {
						a++;
						continue;
					}else{
						a--;
						b++;

						continue;
					}
				}else {
					if((a+b) % 2 == 0 ) {
						a--;
						b++;
					}else {
						a++;
						b--;
					}
				}
				
			}
			
			System.out.println(a + "/" + b);
		}
		
		
	}
}



