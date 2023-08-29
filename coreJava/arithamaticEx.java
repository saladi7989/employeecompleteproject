package com.corejavaexample;

public class arithamaticEx {

	public static void main(String[] args) {
		int x=10;
		   int y=0;
		   
		String msg=arimaexcep(x,y);
		System.out.println(msg);
		System.out.println("after exception");
		
		
	}
       public static String arimaexcep( int x, int y) {
   		 String msg=null;
		try  
   	        {  
   	        int z=x/y;
   	        msg="true";
   	        }    
   	        catch(ArithmeticException e)  
   	        {  
   	           msg =e.getMessage(); 
   	        } 
    	   return msg;
       }
}
