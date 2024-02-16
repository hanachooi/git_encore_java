package com.encore.worksheet7;

public interface MovieService {

	// 영화 제목 스트링 배열 중 생성된 난수를 배열 인덱스로 하는 영화제목을 반환
	public String selectSentence();
	
	// 게임 안내 타이틀 출력
	// 영화제목 스트링을 보이지 않는 모양으로 변환하여 출력한 후 반환.
	// space 면 space 반환, 글자면 "네모" 반환
	public String initGame(String s);
	
	public boolean checkString(char c);
	
}
