package com.java8Example;

public class LambdaForStringLength {

	public static void main(String[] args) {
		
		Xyz len=(name)->{
			
			System.out.println(name.length());		
		};
		len.getlength("sreenu");

	}

}
