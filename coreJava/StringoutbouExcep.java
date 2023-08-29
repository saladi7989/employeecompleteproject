package com.corejavaexample;

public class StringoutbouExcep {

	public static void main(String[] args) {
		  String name="sreenu";
			System.out.println("before exception");
			String msg=stroutbouexce(name);
			System.out.println(msg);
			System.out.println("after exception");
	}
	public static String stroutbouexce(String name) {
		   String msg=null;
		  try  
	        {  
	         
	        System.out.println(name.charAt(10));   
	        }  
	             
	        catch(StringIndexOutOfBoundsException e)  
	        {  
	           msg = e.getMessage();  
	        } 
		  return msg;  
	}
}
