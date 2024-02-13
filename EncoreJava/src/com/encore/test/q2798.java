package com.encore.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q2798 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		// N = 5 -> 4.3.2.1.0 i->3
		
		StringBuilder sb =  new StringBuilder();

		for(int i=0; i<N; i++) {
			for(int j = N-1; j>=0; j--) {
				sb.append(" ");
			}
			for(int j = 1; j<2*i + 1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}