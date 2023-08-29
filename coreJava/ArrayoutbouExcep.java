package com.corejavaexample;

public class ArrayoutbouExcep {

	public static void main(String[] args) {
		 int arr[]= {1,3,5,7};
		 String msg=arrayoutbouexce(arr);
		 System.out.println(msg);
		 System.out.println("after exception");
		 
	}
	public static String arrayoutbouexce(int arr[]) {
		String msg=null;
		  try  
	        {  
	         
	        System.out.println(arr[10]);   
	        }  
	             
	        catch(ArrayIndexOutOfBoundsException e)  
	        {  
	            msg=e.getMessage();  
	        }  
	     return msg;

	}

}
