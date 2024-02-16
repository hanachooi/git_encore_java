package com.encore.worksheet7;

import java.util.Random;

public class MovieServiceImpl implements MovieService{

	private String[] sentenceDictionary = {
			"Matrix", 
			"I know what you did last summer",
			"The Silence Of The Lambs",
			"Saving Private Ryan",
			"Black Hawk Down",
			"American Pie",
			"Enemy Of The State"
	};
	String s;
	StringBuffer sb = new StringBuffer();

	@Override
	public String selectSentence() {
		
		Random random = new Random();
		int N = random.nextInt(sentenceDictionary.length);
		String s = sentenceDictionary[N];
		return s;
	}

	// String 에서 == 이면 주솟값을 비교하게 되므로, .equals 를 사용해야한다. 
	// char 에서는 == 을 사용하면 된다. 
	@Override
	public String initGame(String s) {
		this.s = s;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				sb.append(" ");
			}else {
				sb.append("□");
			}
		}
		return sb.toString();
	}


	@Override
	public boolean checkString(char c) {
		boolean b = false;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == c) {
				sb.replace(i, i+1, String.valueOf(c));
				b = true;
			}
		}
		
		return b;
	}
	
	public String getResult() {
		return sb.toString();
	}
	

	
}
