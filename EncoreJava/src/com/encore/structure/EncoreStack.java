package com.encore.structure;

import java.util.EmptyStackException;

public class EncoreStack {

	private int[] stackAry;
	private int top;
	
	public EncoreStack() {

		stackAry = new int[6];
		top = -1;
	}
	
	public void push(int data) {
		stackAry[++top] = data;
		// 마지막 값이 top이게 됌. 
	}
	
	public int pop() {
		if(top == -1) {
			throw new EmptyStackException();
		}
		return stackAry[top--];
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	// 마지막 입력값 확인
	public int peek() {
		/*
		top = 0;
		while(stackAry[top] != 0) {
			top++;
		}
		return stackAry[top-1]; */
		return stackAry[top];
	}
	
	// 스택에 들어있는 요소를 출력
	public void prtStack() {
		for(int idx = top; idx>=0; idx--) {
			System.out.println(stackAry[idx]);
		}
	}
	
}
