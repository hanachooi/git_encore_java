package com.encore.thread;

public class PrtThread implements Runnable{

	private Prt moniter;
	private char charValue;
	
	public PrtThread(char charValue, Prt moniter) {
		this.charValue = charValue;
		this.moniter = moniter;
	}
	
	@Override
	public void run() {
		//  synchronized 를 하게 되면,
		// 동기화가 되어, 횟수가 보장된다.
		synchronized(moniter) {
			for(int i = 0; i<10; i++) {
				moniter.printChar(charValue);
			}
		}
	}

}
