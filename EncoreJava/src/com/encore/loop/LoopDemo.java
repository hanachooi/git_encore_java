package com.encore.loop;


public class LoopDemo {

	public LoopDemo() {
		
	}
	
	public void loopMethod01() {
		for(int i =0; i<10; i++) {
			System.out.println();
		}
	}
	
	public void sumOneToTen() {
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
		}
	}
}
