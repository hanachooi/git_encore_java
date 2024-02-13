package com.encore.exceptiont;

public class ExceptionMain {

	public static void main(String[] args) {

		/*
		  예외 처리 기본 정리
		String[] strAry = {"SW", "java", "python"};
		try {
			System.out.println("예외 발생 코드 시작점");
			for(int i=0; i<strAry.length; i++) {
				System.out.println(strAry[i]);
			}
			System.out.println("예외 발생 코드 종료점");
		} catch(Exception n) {
			// System.out.println("예외 발생 시 호출되는 영역");
			n.printStackTrace();
		} finally {
			System.out.println("예외 발생 여부와 상관없이 항상 수행");
		}
		System.out.println(">>> main method end <<<");
		
		*/
		try {
		int result = userException();
		} catch(Exception e) {
			// 이렇게 되게 되면, main 의 코드는 출력이 되게 됌.
			e.printStackTrace();
		}
		System.out.println(">>> main method end <<<");
		
	}
	
	public static int userException() throws ArithmeticException{
		int result = 10/0;
		return result;
	}

}





