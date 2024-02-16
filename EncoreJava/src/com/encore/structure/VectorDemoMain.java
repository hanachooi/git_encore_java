package com.encore.structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/* 
 싱글 쓰레드 : 순차 실행 main start - 파일 다운로드(A) - 파일 다운로드(B) - 파일 다운로드(C) - main end 
 멅티 쓰레드 : 병렬 실행 main start - 파일 다운로드(B)(thread) - 파일 다운로드(B)(thread) - 파일 다운로드(C)(thread) - main end
 ArrayList - Vector
 
 vector - 강제동기화로 인해서 성능에 문제가 생긴다. 
 */


public class VectorDemoMain {

	public static void main(String[] args) {
		
		/* Vector의 동기화 여부 확인 
		List<Integer> lst = new ArrayList<Integer>();
		List<Integer> vec = new Vector<Integer>();
		// 동기화가 되어 있어서, lst 는 꼬이는데,
		// vec 는 모든 작업이 수행된다. 
		
		new Thread(() -> {
			for(int idx = 0; idx<10000; idx++) {
				lst.add(idx);	// not synchronized
				vec.add(idx); 	// synchronized
			}
		}).start();
		
		new Thread(() -> {
			for(int idx = 0; idx < 10000; idx++) {
				lst.add(idx);
				vec.add(idx);
			}
		}).start();
		
		// 출력을 위한 쓰레드
		new Thread(() -> {
			try {
				Thread.sleep(2000);
				System.out.println("ArrayList size = " + lst.size());
				System.out.println("Vector size = " + vec.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		*/
		
		
		List<Integer> vec = new Vector<Integer>();
		new Thread(() -> {
			vec.add(1); vec.add(2); vec.add(3);
			System.out.println(vec.get(0));
			System.out.println(vec.get(1));
			System.out.println(vec.get(2));
		}).start();
		
		// remove 0 을 하게 되면, 앞으로 땅겨지므로, 계속 0을 제거해야 함. 
		new Thread(() -> {
			vec.remove(0);
			vec.remove(0);
			vec.remove(0);
		}).start();
		
		new Thread(() -> {
			try {
				Thread.sleep(2000);
				System.out.println("Vector size = " + vec.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();;
		
		
		
	}
}
