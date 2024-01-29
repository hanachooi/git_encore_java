package com.encore.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q2798 {
// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> al = new ArrayList<String>();
		// al.size가 아직 정해지지 않았기 때문에, 여기에 코드가 있으면 안된다.
		//String[] s = new String[al.size()];
		
		
		al.add("a");
		al.add("b");
		al.add("c");
		
		String[] s = new String[al.size()];
		
		for(int i=0; i < s.length; i++) {
			s[i] = al.get(i);
			System.out.println(s[i]);
		}
		
	
		
	}

}
