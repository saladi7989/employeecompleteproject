package com.java8Example;

public class LambdaForArraySum {

	public static void main(String[] args) {
		FunctionForArraySum fas=()->{
			
		 int a[]= {10,250,1,140,120};
	      int sum=0;
	      int count=0;
	    	for(int i=0 ;i<a.length; i++)
	    	{
	    	sum=sum+a[i];
	    	}
	    	System.out.println(sum);
	    	for(int i=1;i<=sum;i++)
	    	{
	    		
	    		if(521%i==0) 
	    		{
	    			count++;
	    		}
	    		if(count==2)
	    			System.out.println("prime"); 
	    	}
		};
		fas.arraysum();
	}

}
