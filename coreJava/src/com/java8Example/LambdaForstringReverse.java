package com.java8Example;

public class LambdaForstringReverse {

	public static void main(String[] args) {
		
		FunctionForStringReverse fsr=()->{
			String[] name={"sreenu","mahesh","srinu","brahma"};
			
		     
			for(int i=name.length-1;i>=0;i--) {
				System.out.println(name[i]);
			}	
		};
		fsr.stringreverse();
	}

}
