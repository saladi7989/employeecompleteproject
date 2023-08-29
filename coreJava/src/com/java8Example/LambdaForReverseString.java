package com.java8Example;

public class LambdaForReverseString {

	public static void main(String[] args) {
		
		FunctionforReverseString frs=()->{
			
			String s="mahesh is good boy";
			String s1[]=s.split(" ");
			for(int i=s1.length-1;i>=0;i--)
			{
				System.out.print(s1[i]);
				System.out.print(" ");
			}
		};
       frs.reversemultipleString();
	}

}
