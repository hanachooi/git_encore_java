package com.encore.thread;

public class DeadLockMain {

	public static void main(String[] args) {

		StringBuffer sb01 = new StringBuffer();
		StringBuffer sb02 = new StringBuffer();
		
		
		// synchronized를 했을 때, First 에서, sb02에 접근을 한 후, sb01에 접근을 하게 될 때, lock 이 되어 버리므로,
		// 서로 같은 StringBuffer로 lock 이 발생하기 때문에, 데드락이 발생한다. 
		new Thread( new DeadLockThreadFirst(sb01, sb02)).start();
		new Thread( new DeadLockThreadSecond(sb01, sb02)).start();
	}

}
