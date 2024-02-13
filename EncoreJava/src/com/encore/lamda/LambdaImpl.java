package com.encore.lamda;

public class LambdaImpl implements ILambda{

	@Override
	public void printInfo(String str) {

		System.out.println(str);
		
	}

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	

}
