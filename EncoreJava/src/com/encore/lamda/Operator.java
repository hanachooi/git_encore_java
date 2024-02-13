package com.encore.lamda;

import java.util.function.DoubleBinaryOperator;

public enum Operator {
	
	/*
	// enum 상수에는 구현부와 기호를 줄 수 있다.
	PLUS("+"){
		public double apply(double x, double y) {
			return x+y;
		}
	},
	MINUS("-"){
		public double apply(double x, double y) {
			return x-y;
		}
	};
	*/
	// enum 을 람다식으로
	PLUS("+", (double x, double y) -> x+y), 
	MINUS("-", (double x, double y) -> x-y);
	
	public final DoubleBinaryOperator op;

	// 상수는 위에 정의가 되어야 하므로, enum 타입을 위에다가 써놔야 한다.
	public final String symbol;
	Operator(String symbol, DoubleBinaryOperator op) {
		this.symbol = symbol;
		this.op = op;
	}
	
	public String toString() {
		return symbol;
	}
	
	public double apply(double x, double y) {
		return op.applyAsDouble(x, y);
	}
}
