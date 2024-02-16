package com.encore.structure;

import java.util.Stack;

public class StackDemoMain {

	public static void main(String[] args) {

		/* 스택 push pop 배우기
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		// 비어있으므로 오류 발생. 
		//System.out.println(stack.pop());
		 */
		
		/* 스택 여러 함수
		Stack<String> stack = new Stack<String>();
		// empty 인지 확인하기
		System.out.println("empty : " + stack.empty());
		System.out.println("empty : " + stack.isEmpty());
		System.out.println("스택에 데이터가 없을 때 입력하고 싶다면? ");
		
		if( stack.isEmpty()) {
			stack.push("One");
			stack.push("Two");
			stack.push("Three");
		}
		System.out.println(stack);
		stack.add(0, "Four");
		System.out.println(stack);
		String str = stack.pop();
		System.out.println("pop: " + str);
		System.out.println(str.equals("Four"));	// pop이 된 Three가 str로 저장됌. 
		System.out.println("size : " + stack.size());
		System.out.println(stack);
		System.out.println("search : " + stack.search("One"));	// 스택 내에서 후입 선출로, One은 2라는 값이 리턴됌.
		System.out.println("search : " + stack.search("Four")); // Four는 pop 기준 3이므로, 3의 값이 리턴 됌. 
		*/
		
		// 스택을 쓸 때는, 스택이 비어있는지 아닌지를 항상 먼저 확인해야 한다 
		// 배열로 스택 구현해보기 
		EncoreStack stack = new EncoreStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		/*
		if(stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}else {
			System.out.println(stack.pop());
		}
		*/
		stack.prtStack();
		System.out.println("peek : " + stack.peek());
		System.out.println("main end");
	}
}
