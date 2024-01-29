package com.encore.test;

public class StringDemoMain {

	public static void main(String[] args) {

		String str = "abcde";
		char d = str.charAt(2);
		System.out.println(d);
		
		String str01 = new String("임정섭");
		String str02 = new String("임정섭");
		
		if(str01 == str02) {
			System.out.println("주소값이 동일합니다.");
		}else {
			System.out.println("주소값이 다릅니다.");
		}
		
		if(str01.equals(str02)) {
			System.out.println("값이 동일합니다. ");
		}else {
			System.out.println("값이 다릅니다. ");
		}
	}

}
