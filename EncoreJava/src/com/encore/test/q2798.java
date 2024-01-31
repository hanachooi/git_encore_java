package com.encore.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2798 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<N; i++) {
			Printt(N,M, sb);
		}
		
	}
	// 클래스 자체에 속하는 메서드이기에, static을 사용해야함. 
	public static void Printt(int N, int M, StringBuilder sb) {
		for(int i=N; i<=M; i++) {
			if(i!=M) {
				sb.append(N).append(" ").append(i);
				System.out.println(sb.toString());
				sb.delete(0, 3);
			}
		}
	}
}
