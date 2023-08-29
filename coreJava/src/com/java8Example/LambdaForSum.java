package com.java8Example;

public class LambdaForSum {

	public static void main(String[] args) {
	
		FunctionForSum fs=()->{
			int x=20;
			int y=30;
			int z=x+y;
		};
         fs.sum();
	}

}
