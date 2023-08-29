package com.java8Example;

public class LambdaForPrimenumber {

	public static void main(String[] args) {
		
		FunctionForPrimenumber fp=()->{
			 int a=8;
		     int count =0;
		      for(int i=1;i<=a;i++) {
			   if(a%i==0)
				count++;
		      }
		       if(count==2)
			    System.out.println("given number is primenumber ");
		       else 
			    System.out.println("given number is not a prime number");
			};
		fp.primenumber();

	}

}
