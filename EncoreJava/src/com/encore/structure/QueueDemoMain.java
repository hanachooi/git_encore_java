package com.encore.structure;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 먼저 들어간 데이터가 먼저 나오는 FIFO(Enqueue, Dequeue)
 * 선입선출
 */

public class QueueDemoMain {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(10); queue.offer(20); queue.offer(40);
		// .poll() 함수는 값이 없어도, 오류가 아니라, null 을 반환한다. 
		// .remove() 함수는 값이 없다면, 오류를 발생시킨다.
		System.out.println("poll : " + queue.poll());
		System.out.println("size : " + queue.size());
		System.out.println("remove : " + queue.remove());
		System.out.println("main end");
		
	}
}
