import com.encore.thread.ShareObj;

public class ThreadDemoMain {

	// 멀티 스레드는 각 스레드들이 영향을 받아서는 안된다. 
	// jvm 이 lazy 상태인 스레드 중에 랜덤히게 초이스 되어서, 실행되게 됌. 
	// main 함수는 프로세스 안에서 실직적으로 작업을 실행하는 단위(스레드)임.
	public static void main(String[] args) {

		System.out.println("main thread start!!");
		ShareObj obj = new ShareObj(); 		// 이걸 스레드로 실행시키고 싶음.
		Thread thread01 = new Thread(obj);
		thread01.start();// start 함수를 호출하면, run 함수가 호출이 된다. run 함수를 바로
		// 실행시키면 안된다. 
		
		ShareObj obj02 = new ShareObj();
		Thread thread02 = new Thread(obj02);
		thread02.start();
		
		// obj.running();
		// obj.running();
		
		// 이렇게 호출하면 안된다. obj.run();
		
		System.out.println("main thread end !!");
	}

}
