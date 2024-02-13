package com.encore.thread;

public class DeadLockThreadFirst implements Runnable{
	
	// 현업에서는 이거 사용. 
	private StringBuffer sb01, sb02;
	
	public DeadLockThreadFirst() {
		
	}
	
	public DeadLockThreadFirst(StringBuffer sb01, StringBuffer sb02) {
		this.sb01 = sb01;
		this.sb02 = sb02;
	}
	
	@Override
	public void run() {
		synchronized (sb02) {
			sb02.append("encore");
		}
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		synchronized (sb01) {
			sb01.append("hanhwa");
			System.out.println(sb01.toString() + sb02.toString());
		}
	}
	
}
