package com.java8Example;

public class LambdaForStarsorder {

	public static void main(String[] args) {
		
		FunctionForStarOrder fs=()->{
					for(int i=1;i<=5;i++) {
						for(int j=1;j<=i;j++) {
						System.out.print("*");
						}
						System.out.println( );
			}
			};
			fs.starsorder();
	}
			
	}


