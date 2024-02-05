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
		String str;
		
		while((str = br.readLine()) != null) {
			String[] s = str.split(" ");
			bw.write(Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + "\n");
			
		}
		bw.flush();

	}
}