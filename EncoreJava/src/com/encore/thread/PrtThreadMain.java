package com.encore.thread;
/*
 * 멀티 쓰레드 환경에서 공유객체를 동시에 사용할 때 발생하는 문제를
 * 해결하기 위해서는 동기화 작업이 필요하다. 
 * synchronized 키워드를 이용하는 방법이 있다. 
 * */
public class PrtThreadMain {

	public static void main(String[] args) {

		System.out.println("main thread start !!");
		
		Prt prt = new Prt();
		//prt.printChar('A');
		
		// 비동기식으로 멀티스레드를 만들게 되면,
		// 스레드의 동작이 꼬이게 된다.
		// 이를 해결하기 위해, lock을 걸면 된다.
		PrtThread runnable01 = new PrtThread('A', prt);
		Thread thread01 = new Thread(runnable01);
		thread01.start();
		
		PrtThread runnable02 = new PrtThread('B', prt);
		Thread thread02 = new Thread(runnable02);
		thread02.start();
		
		PrtThread runnable03 = new PrtThread('C', prt);
		Thread thread03 = new Thread(runnable03);
		thread03.start();
		
		System.out.println("main thread end !!");
		
	}

}
