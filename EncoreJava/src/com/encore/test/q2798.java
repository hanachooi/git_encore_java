package com.encore.test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q2798 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		// int 형으로 받아야함. String 은 누적하는게 아니기 때문. 
		int g = N;
		
		for(int i = 0; i<N; i++) {
			String s = br.readLine();
			boolean[] visited = new boolean[26];
			visited[s.charAt(0)-'a'] = true;
			for(int j = 1; j<s.length(); j++) {
				if(visited[s.charAt(j) - 'a']) {
					if( s.charAt(j-1) != s.charAt(j) ) {
						g--;
						break;
					}
				}
				visited[s.charAt(j)-'a'] = true;
			}
		}
		System.out.println(g);
	}
}



