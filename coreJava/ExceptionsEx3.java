package com.corejavaexample;

public class ExceptionsEx3 {

	public static void main(String[] args) {
		String name =null;
		String msg=nullexcep(name);
		System.out.println(msg);
		System.out.println("after exception");
	
	}
	public static String nullexcep(String ptr) {
		
	
	String msg= null;
	try
	{
	    if (ptr.equals("sreenu")) {
	    	
	       msg="Same";
	}
	    }
	
	catch(NullPointerException e){
		msg=e.getMessage();
	    
	}
	return msg;
}
}
	
//	public static void arithenull() {
//
//		int x=10;
//		int y=0;
//		
//		  try  
//	        {  
//	        int z=x/y;    
//	        }    
//	        catch(ArithmeticException e)  
//	        {  
//	            System.out.println(e);  
//	        }  
//	        System.out.println("after  exception");  
//	}
//	
//	public static void arrayoutexcep() {
//		
//		 int arr[]= {1,3,5,7};
//		
//		  try  
//	        {  
//	         
//	        System.out.println(arr[10]);   
//	        }  
//	             
//	        catch(ArrayIndexOutOfBoundsException e)  
//	        {  
//	            System.out.println(e);  
//	        }  
//	        System.out.println("after exception"); 
//	}
//	
//	public static void stringoutbound() {
//		 int arr[]= {1,3,5,7};
//			
//		  try  
//	        {  
//	         
//	        System.out.println(arr[10]);   
//	        }  
//	             
//	        catch(ArrayIndexOutOfBoundsException e)  
//	        {  
//	            System.out.println(e);  
//	        }  
//	        System.out.println("after exception"); 
//	}
//}
//
