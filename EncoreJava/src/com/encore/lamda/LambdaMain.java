package com.encore.lamda;

public class LambdaMain {

	public static void main(String[] args) {


		// 인터페이스는 인스턴스 생성은 안되지만, 변수의 타입으로는 사용이 가능하다. 
		/*ILambda lambda = new ILambda() {
			@Override
			public void printInfo(String str) {
				System.out.println(str);
			}

			@Override
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		*/

		
		// 인터페이스의 인스턴스 생성하는 방법. 
		/*
		ILambda lambda = (str) -> System.out.println(str);
		lambda.printInfo("hello~");
		*/
		/*
		ILambda lambda = new LambdaImpl();
		lambda.printInfo("기존 코드 방식");
		System.out.println("add = " + lambda.add(10,10));
		*/
		
		ILambda lambda = new ILambda() {
			
			@Override
			public void printInfo(String str) {
				System.out.println(str);
			}
			
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
		lambda.printInfo("hello~");
		System.out.println("add = " + lambda.add(10, 10));
		
		/*
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {

				for(int i=0; i<10; i++) {
					System.out.println(i);
				}
				
			}
		});
		*/
		/*
		Thread thread = new Thread(
			() -> {
				for(int i = 0; i<10; i++) {
					System.out.println(i);
				}
			}
		);
		thread.start();
		*/
		System.out.println(Operator.PLUS.apply(10, 10));
	}
	
	
	
}
