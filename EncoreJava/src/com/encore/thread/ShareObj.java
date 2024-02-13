package com.encore.thread;

/*자바에서 쓰레드의 대상이 되는 객체를 정의하고 싶다면,
 * 1/ entends thread
 * 2. implement Thread implement Runnale;
 * */
public class ShareObj implements Runnable{

	public ShareObj() {
		
	}
	
	// 스레드의 구현부
	// 코드상에서 개발자가 직접적으로 호출할 수 없다.
	// start 함수를 이용해서 호출해야 한다.
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.print(i + "\t");
			try {
				// 해당 스레드가 몇 초 단위로 실행이 될 수 있도록 해야함.
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
