package com.encore.worksheet7;

public class MovieMain {

	public static void main(String[] args) {
		
		// 
		MovieService service = new MovieServiceImpl();
		MovieView view = new MovieView();
		String s = service.selectSentence();
		System.out.println(s);
		view.menu();
		System.out.println(service.initGame(s));
		
		for(int i = 0; i<5; i++) {
			char c = view.getOneLetter();
			// System.out.println("main - " + c);
			if(service.checkString(c)) {
				//System.out.println("if");
				System.out.println(((MovieServiceImpl) service).getResult());
			}else {
				System.out.println("존재하지 않습니다.");
			}
		}
	}
}
